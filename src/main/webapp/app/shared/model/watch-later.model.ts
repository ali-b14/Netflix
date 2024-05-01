import { IVideo } from 'app/shared/model/video.model';

export interface IWatchLater {
  id?: number;
  video?: IVideo | null;
}

export const defaultValue: Readonly<IWatchLater> = {};
