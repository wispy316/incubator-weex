#ifndef WEEX_PROJECT_UPDATESTYLEACTION_H
#define WEEX_PROJECT_UPDATESTYLEACTION_H

#include "RenderAction.h"

using namespace WeexCore;

namespace WeexCore {

  class UpdateStyleAction : public RenderAction {

    void ExecuteAction() {
      BridgeAndroid::getInstance()->callUpdateStyleByWeexCore(mPageId, mRef, mKey, mValue);
    }
  };
}

#endif //WEEX_PROJECT_UPDATESTYLEACTION_H
