import dayjs from 'dayjs';
import { IVideoMetaData } from 'app/shared/model/video-meta-data.model';

export interface IVideo {
  id?: number;
  title?: string;
  description?: string | null;
  urlContentType?: string;
  url?: string;
  uploadDate?: dayjs.Dayjs;
  metaData?: IVideoMetaData | null;
}

export const defaultValue: Readonly<IVideo> = {};
