import React, { useEffect } from 'react';
import { Link, useParams } from 'react-router-dom';
import { Button, Row, Col } from 'reactstrap';
import { TextFormat } from 'react-jhipster';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

import { APP_DATE_FORMAT, APP_LOCAL_DATE_FORMAT } from 'app/config/constants';
import { useAppDispatch, useAppSelector } from 'app/config/store';

import { getEntity } from './like.reducer';

export const LikeDetail = () => {
  const dispatch = useAppDispatch();

  const { id } = useParams<'id'>();

  useEffect(() => {
    dispatch(getEntity(id));
  }, []);

  const likeEntity = useAppSelector(state => state.like.entity);
  return (
    <Row>
      <Col md="8">
        <h2 data-cy="likeDetailsHeading">Like</h2>
        <dl className="jh-entity-details">
          <dt>
            <span id="id">ID</span>
          </dt>
          <dd>{likeEntity.id}</dd>
          <dt>
            <span id="likedAt">Liked At</span>
          </dt>
          <dd>{likeEntity.likedAt ? <TextFormat value={likeEntity.likedAt} type="date" format={APP_DATE_FORMAT} /> : null}</dd>
          <dt>Video</dt>
          <dd>{likeEntity.video ? likeEntity.video.id : ''}</dd>
        </dl>
        <Button tag={Link} to="/like" replace color="info" data-cy="entityDetailsBackButton">
          <FontAwesomeIcon icon="arrow-left" /> <span className="d-none d-md-inline">Back</span>
        </Button>
        &nbsp;
        <Button tag={Link} to={`/like/${likeEntity.id}/edit`} replace color="primary">
          <FontAwesomeIcon icon="pencil-alt" /> <span className="d-none d-md-inline">Edit</span>
        </Button>
      </Col>
    </Row>
  );
};

export default LikeDetail;
