import React, { useEffect } from 'react';
import { Link, useParams } from 'react-router-dom';
import { Button, Row, Col } from 'reactstrap';
import { openFile, byteSize, TextFormat } from 'react-jhipster';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

import { APP_DATE_FORMAT, APP_LOCAL_DATE_FORMAT } from 'app/config/constants';
import { useAppDispatch, useAppSelector } from 'app/config/store';

import { getEntity } from './video.reducer';

export const VideoDetail = () => {
  const dispatch = useAppDispatch();

  const { id } = useParams<'id'>();

  useEffect(() => {
    dispatch(getEntity(id));
  }, []);

  const videoEntity = useAppSelector(state => state.video.entity);
  return (
    <Row>
      <Col md="8">
        <h2 data-cy="videoDetailsHeading">Video</h2>
        <dl className="jh-entity-details">
          <dt>
            <span id="id">ID</span>
          </dt>
          <dd>{videoEntity.id}</dd>
          <dt>
            <span id="title">Title</span>
          </dt>
          <dd>{videoEntity.title}</dd>
          <dt>
            <span id="description">Description</span>
          </dt>
          <dd>{videoEntity.description}</dd>
          <dt>
            <span id="url">Url</span>
          </dt>
          <dd>
            {videoEntity.url ? (
              <div>
                {videoEntity.urlContentType ? <a onClick={openFile(videoEntity.urlContentType, videoEntity.url)}>Open&nbsp;</a> : null}
                <span>
                  {videoEntity.urlContentType}, {byteSize(videoEntity.url)}
                </span>
              </div>
            ) : null}
          </dd>
          <dt>
            <span id="uploadDate">Upload Date</span>
          </dt>
          <dd>{videoEntity.uploadDate ? <TextFormat value={videoEntity.uploadDate} type="date" format={APP_DATE_FORMAT} /> : null}</dd>
          <dt>Meta Data</dt>
          <dd>{videoEntity.metaData ? videoEntity.metaData.id : ''}</dd>
        </dl>
        <Button tag={Link} to="/video" replace color="info" data-cy="entityDetailsBackButton">
          <FontAwesomeIcon icon="arrow-left" /> <span className="d-none d-md-inline">Back</span>
        </Button>
        &nbsp;
        <Button tag={Link} to={`/video/${videoEntity.id}/edit`} replace color="primary">
          <FontAwesomeIcon icon="pencil-alt" /> <span className="d-none d-md-inline">Edit</span>
        </Button>
      </Col>
    </Row>
  );
};

export default VideoDetail;
