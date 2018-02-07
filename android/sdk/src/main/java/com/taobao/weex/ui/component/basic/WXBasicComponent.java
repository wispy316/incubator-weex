/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.taobao.weex.ui.component.basic;

import android.support.annotation.NonNull;
import android.view.View;

import com.taobao.weex.common.Constants;
import com.taobao.weex.dom.WXAttr;
import com.taobao.weex.dom.WXEvent;
import com.taobao.weex.dom.WXStyle;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.action.GraphicPosition;
import com.taobao.weex.ui.action.GraphicSize;
import com.taobao.weex.dom.CSSShorthand;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.utils.WXUtils;

import java.util.Map;
import java.util.Set;

public abstract class WXBasicComponent<T extends View> {

  private Object mExtra;
  private String mComponentType;
  private String mRef;
  private GraphicPosition mLayoutPosition = new GraphicPosition(0, 0, 0, 0);
  private GraphicSize mLayoutSize = new GraphicSize(0, 0);
  private BasicComponentData mBasicComponentData;

  private int mViewPortWidth = 750;

  public WXBasicComponent(BasicComponentData basicComponentData) {
    this.mBasicComponentData = basicComponentData;
    this.mBasicComponentData.addStyle(getDefaultAttrs());
    this.mRef = basicComponentData.mRef;
    this.mComponentType = basicComponentData.mComponentType;
  }

  protected Map<String, String> getDefaultAttrs() {
    return null;
  }

  protected void copyData(WXComponent component) {
    mComponentType = component.getComponentType();
    mRef = component.getRef();
  }

  public final @NonNull
  WXStyle getStyles() {
    if (mBasicComponentData != null) {
      return mBasicComponentData.getStyles();
    }
    return null;
  }

  public final @NonNull
  WXAttr getAttrs() {
    if (mBasicComponentData != null) {
      return mBasicComponentData.getAttrs();
    }
    return null;
  }

  public final @NonNull
  WXEvent getEvents() {
    if (mBasicComponentData != null) {
      return mBasicComponentData.getEvents();
    }
    return null;
  }

  /**
   * Get this node's margin, as defined by cssstyle + default margin.
   */
  public final @NonNull
  CSSShorthand getMargin() {
    if (mBasicComponentData != null) {
      return mBasicComponentData.getMargin();
    }
    return null;
  }

  /**
   * Get this node's padding, as defined by cssstyle + default padding.
   */
  public final @NonNull
  CSSShorthand getPadding() {
    if (mBasicComponentData != null) {
      return mBasicComponentData.getPadding();
    }
    return null;
  }

  /**
   * Get this node's border, as defined by cssstyle.
   */
  public @NonNull
  CSSShorthand getBorder() {
    if (mBasicComponentData != null) {
      return mBasicComponentData.getBorder();
    }
    return null;
  }

  public final void setMargins(@NonNull CSSShorthand margins) {
    if (mBasicComponentData != null) {
      mBasicComponentData.setMargins(margins);
    }
  }

  public final void setPaddings(@NonNull CSSShorthand paddings) {
    if (mBasicComponentData != null) {
      mBasicComponentData.setPaddings(paddings);
    }
  }

  public final void setBorders(@NonNull CSSShorthand borders) {
    if (mBasicComponentData != null) {
      mBasicComponentData.setBorders(borders);
    }
  }

  public final void addAttr(Map<String, Object> attrs) {
    if (attrs == null || attrs.isEmpty()) {
      return;
    }
    if (mBasicComponentData != null) {
      mBasicComponentData.addAttr(attrs);
    }
  }

  public final void addStyle(Map<String, Object> styles) {
    if (styles == null || styles.isEmpty()) {
      return;
    }
    if (mBasicComponentData != null) {
      mBasicComponentData.addStyle(styles);
    }
  }

  public final void addStyle(Map<String, Object> styles, boolean byPesudo) {
    if (styles == null || styles.isEmpty()) {
      return;
    }
    if (mBasicComponentData != null) {
      mBasicComponentData.addStyle(styles, byPesudo);
    }
  }

  public final void addEvent(Set<String> events) {
    if (events == null || events.isEmpty()) {
      return;
    }

    if (mBasicComponentData != null) {
      mBasicComponentData.addEvent(events);
    }
  }

  public final void addShorthand(Map<String, String> shorthand) {
    if (!shorthand.isEmpty() && mBasicComponentData != null) {
      mBasicComponentData.addShorthand(shorthand);
    }
  }

  public int getViewPortWidth() {
    return mViewPortWidth;
  }

  public void setViewPortWidth(int mViewPortWidth) {
    this.mViewPortWidth = mViewPortWidth;
  }

  public Object getExtra() {
    return mExtra;
  }

  public void updateExtra(Object extra) {
    this.mExtra = extra;
  }

  public String getComponentType() {
    return mComponentType;
  }

  public String getRef() {
    return mRef;
  }

  protected GraphicPosition getLayoutPosition() {
    return mLayoutPosition;
  }

  protected void setLayoutPosition(GraphicPosition mLayoutPosition) {
    this.mLayoutPosition = mLayoutPosition;
  }

  protected GraphicSize getLayoutSize() {
    return mLayoutSize;
  }

  protected void setLayoutSize(GraphicSize mLayoutSize) {
    this.mLayoutSize = mLayoutSize;
  }

  public float getCSSLayoutTop() {
    return mLayoutPosition.getTop();
  }

  public float getCSSLayoutBottom() {
    return mLayoutPosition.getBottom();
  }

  public float getCSSLayoutLeft() {
    return mLayoutPosition.getLeft();
  }

  public float getCSSLayoutRight() {
    return mLayoutPosition.getRight();
  }

  public float getLayoutWidth() {
    return mLayoutSize == null ? 0 : mLayoutSize.getWidth();
  }

  public float getLayoutHeight() {
    return mLayoutSize == null ? 0 : mLayoutSize.getHeight();
  }



//  public float getPaddingTop() {
//    float temp = WXUtils.getFloat(get(Constants.Name.PADDING_TOP));
//    if (WXUtils.isUndefined(temp)) {
//      temp = WXUtils.getFloat(get(Constants.Name.PADDING));
//    }
//    return temp;
//  }
//
//  public float getPaddingLeft() {
//    float temp = WXUtils.getFloat(get(Constants.Name.PADDING_LEFT));
//    if (WXUtils.isUndefined(temp)) {
//      temp = WXUtils.getFloat(get(Constants.Name.PADDING));
//    }
//    return temp;
//  }
//
//  public float getPaddingRight() {
//    float temp = WXUtils.getFloat(get(Constants.Name.PADDING_RIGHT));
//    if (WXUtils.isUndefined(temp)) {
//      temp = WXUtils.getFloat(get(Constants.Name.PADDING));
//    }
//    return temp;
//  }
//
//  public float getPaddingBottom() {
//    float temp = WXUtils.getFloat(get(Constants.Name.PADDING_BOTTOM));
//    if (WXUtils.isUndefined(temp)) {
//      temp = WXUtils.getFloat(get(Constants.Name.PADDING));
//    }
//    return temp;
//  }
//
//  public float getMarginTop() {
//    float temp = WXUtils.getFloat(get(Constants.Name.MARGIN_TOP));
//    if (WXUtils.isUndefined(temp)) {
//      temp = WXUtils.getFloat(get(Constants.Name.MARGIN));
//    }
//    return temp;
//  }
//
//  public float getMarginLeft() {
//    float temp = WXUtils.getFloat(get(Constants.Name.MARGIN_LEFT));
//    if (WXUtils.isUndefined(temp)) {
//      temp = WXUtils.getFloat(get(Constants.Name.MARGIN));
//    }
//    return temp;
//  }
//
//  public float getMarginRight() {
//    float temp = WXUtils.getFloat(get(Constants.Name.MARGIN_RIGHT));
//    if (WXUtils.isUndefined(temp)) {
//      temp = WXUtils.getFloat(get(Constants.Name.MARGIN));
//    }
//    return temp;
//  }
//
//  public float getMarginBottom() {
//    float temp = WXUtils.getFloat(get(Constants.Name.MARGIN_BOTTOM));
//    if (WXUtils.isUndefined(temp)) {
//      temp = WXUtils.getFloat(get(Constants.Name.MARGIN));
//    }
//    return temp;
//  }
//
//
//  public float getBorderRightWidth() {
//    return getBorderWidth(Constants.Name.BORDER_RIGHT_WIDTH);
//  }
//
//  public float getBorderTopWidth() {
//    return getBorderWidth(Constants.Name.BORDER_TOP_WIDTH);
//  }
//
//  public float getBorderBottomWidth() {
//    return getBorderWidth(Constants.Name.BORDER_BOTTOM_WIDTH);
//  }
//
//  public float getBorderLeftWidth() {
//    return getBorderWidth(Constants.Name.BORDER_LEFT_WIDTH);
//  }

//  public float getDefaultWidth() {
//    return WXUtils.getFloat(mBasicComponentData.getStyles().get(Constants.Name.DEFAULT_WIDTH));
//  }

  public float getMinWidth() {
    return WXUtils.getFloat(mBasicComponentData.getStyles().get(Constants.Name.MIN_WIDTH));
  }

  public float getMaxWidth() {
    return WXUtils.getFloat(mBasicComponentData.getStyles().get(Constants.Name.MAX_WIDTH));
  }

//  public float getDefaultHeight() {
//    return WXUtils.getFloat(mBasicComponentData.getStyles().get(Constants.Name.DEFAULT_HEIGHT));
//  }

  public float getMinHeight() {
    return WXUtils.getFloat(mBasicComponentData.getStyles().get(Constants.Name.MIN_HEIGHT));
  }

  public float getMaxHeight() {
    return WXUtils.getFloat(mBasicComponentData.getStyles().get(Constants.Name.MAX_HEIGHT));
  }
}
