export interface IVideoMetaData {
  id?: number;
  type?: string | null;
  description?: string | null;
}

export const defaultValue: Readonly<IVideoMetaData> = {};
