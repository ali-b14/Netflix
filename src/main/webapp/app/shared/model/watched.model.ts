import dayjs from 'dayjs';
import { IVideo } from 'app/shared/model/video.model';

export interface IWatched {
  id?: number;
  watchedAt?: dayjs.Dayjs;
  video?: IVideo | null;
}

export const defaultValue: Readonly<IWatched> = {};
