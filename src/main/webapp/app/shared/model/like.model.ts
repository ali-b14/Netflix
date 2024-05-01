import dayjs from 'dayjs';
import { IVideo } from 'app/shared/model/video.model';

export interface ILike {
  id?: number;
  likedAt?: dayjs.Dayjs;
  video?: IVideo | null;
}

export const defaultValue: Readonly<ILike> = {};
