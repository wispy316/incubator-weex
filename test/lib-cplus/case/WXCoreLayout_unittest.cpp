/**
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

// @Generated by gentest/gentest.rb from gentest/fixtures/YGMarginTest.html

#include <gtest/gtest.h>
#include "WXCoreLayout.h"

TEST(StyleTest, width_height) {
  using namespace WXCoreFlexLayout;
  WXCoreLayoutNode *root = WXCoreLayoutNode::newWXCoreNode();
  root->setStyleWidth(1000.1f);
  root->setStyleHeight(600.1f);
  root->calculateLayout();
  ASSERT_FLOAT_EQ(1000.1f, root->getLayoutWidth());
  root->freeWXCoreNode();
}

