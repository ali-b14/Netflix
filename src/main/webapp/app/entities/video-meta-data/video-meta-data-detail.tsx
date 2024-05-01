import React, { useEffect } from 'react';
import { Link, useParams } from 'react-router-dom';
import { Button, Row, Col } from 'reactstrap';
import {} from 'react-jhipster';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

import { useAppDispatch, useAppSelector } from 'app/config/store';

import { getEntity } from './video-meta-data.reducer';

export const VideoMetaDataDetail = () => {
  const dispatch = useAppDispatch();

  const { id } = useParams<'id'>();

  useEffect(() => {
    dispatch(getEntity(id));
  }, []);

  const videoMetaDataEntity = useAppSelector(state => state.videoMetaData.entity);
  return (
    <Row>
      <Col md="8">
        <h2 data-cy="videoMetaDataDetailsHeading">Video Meta Data</h2>
        <dl className="jh-entity-details">
          <dt>
            <span id="id">ID</span>
          </dt>
          <dd>{videoMetaDataEntity.id}</dd>
          <dt>
            <span id="type">Type</span>
          </dt>
          <dd>{videoMetaDataEntity.type}</dd>
          <dt>
            <span id="description">Description</span>
          </dt>
          <dd>{videoMetaDataEntity.description}</dd>
        </dl>
        <Button tag={Link} to="/video-meta-data" replace color="info" data-cy="entityDetailsBackButton">
          <FontAwesomeIcon icon="arrow-left" /> <span className="d-none d-md-inline">Back</span>
        </Button>
        &nbsp;
        <Button tag={Link} to={`/video-meta-data/${videoMetaDataEntity.id}/edit`} replace color="primary">
          <FontAwesomeIcon icon="pencil-alt" /> <span className="d-none d-md-inline">Edit</span>
        </Button>
      </Col>
    </Row>
  );
};

export default VideoMetaDataDetail;
