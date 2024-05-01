import React from 'react';

import MenuItem from 'app/shared/layout/menus/menu-item';

const EntitiesMenu = () => {
  return (
    <>
      {/* prettier-ignore */}
      <MenuItem icon="asterisk" to="/video">
        Video
      </MenuItem>
      <MenuItem icon="asterisk" to="/video-meta-data">
        Video Meta Data
      </MenuItem>
      <MenuItem icon="asterisk" to="/comment">
        Comment
      </MenuItem>
      <MenuItem icon="asterisk" to="/like">
        Like
      </MenuItem>
      <MenuItem icon="asterisk" to="/watched">
        Watched
      </MenuItem>
      <MenuItem icon="asterisk" to="/watch-later">
        Watch Later
      </MenuItem>
      {/* jhipster-needle-add-entity-to-menu - JHipster will add entities to the menu here */}
    </>
  );
};

export default EntitiesMenu;
