import dayjs from 'dayjs';
import { IVideo } from 'app/shared/model/video.model';

export interface IComment {
  id?: number;
  text?: string;
  postedAt?: dayjs.Dayjs;
  video?: IVideo | null;
}

export const defaultValue: Readonly<IComment> = {};
