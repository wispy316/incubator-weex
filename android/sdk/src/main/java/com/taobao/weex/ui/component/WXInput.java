/*
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
package com.taobao.weex.ui.component;

import android.text.TextPaint;

import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.Component;
import com.taobao.weex.common.Constants;
import com.taobao.weex.dom.CSSConstants;
import com.taobao.weex.dom.WXStyle;
import com.taobao.weex.layout.ContentBoxMeasurement;
import com.taobao.weex.layout.MeasureSize;
import com.taobao.weex.ui.action.CommonCompData;
import com.taobao.weex.ui.view.WXEditText;
import com.taobao.weex.utils.TypefaceUtil;

import static com.taobao.weex.dom.WXStyle.UNSET;

/**
 *
 * Input component
 */
@Component(lazyload = false)
public class WXInput extends AbstractEditComponent{

  @Deprecated
  public WXInput(WXSDKInstance instance, WXVContainer parent, String instanceId, boolean isLazy, CommonCompData commonCompData) {
    this(instance, parent, isLazy, commonCompData);
  }

  public WXInput(WXSDKInstance instance, WXVContainer parent, boolean isLazy, CommonCompData commonCompData) {
    super(instance, parent, isLazy, commonCompData);
  }

  @Override
  protected void appleStyleAfterCreated(WXEditText editText) {
    super.appleStyleAfterCreated(editText);
    editText.setSingleLine();//default use single line , same to ios
  }
}
