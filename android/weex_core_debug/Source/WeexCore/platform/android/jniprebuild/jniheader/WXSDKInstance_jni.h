// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     /Users/miomin/Desktop/workspace/alibaba/WeexCore-dev/WeexCore-
//    dev/android/weex_core_debug/Source/WeexCore/platform/android/jniprebuild/jni_generator.py
// For
//     com/taobao/weex/WXSDKInstance

#ifndef com_taobao_weex_WXSDKInstance_JNI
#define com_taobao_weex_WXSDKInstance_JNI

#include <jni.h>

//#include "base/android/jni_int_wrapper.h"

// Step 1: forward declarations.
namespace {
const char kWXSDKInstanceClassPath[] = "com/taobao/weex/WXSDKInstance";
// Leaking this jclass as we cannot use LazyInstance from some threads.
jclass g_WXSDKInstance_clazz = NULL;
#define WXSDKInstance_clazz(env) g_WXSDKInstance_clazz

}  // namespace

static void BindComponentToWXCore(JNIEnv* env, jobject jcaller,
    jstring instanceId,
    jobject component,
    jstring ref);

static void BindInstanceToWXCore(JNIEnv* env, jobject jcaller,
    jstring instanceId,
    jobject instance);

static void OnInstanceClose(JNIEnv* env, jobject jcaller,
    jstring instanceId);

static void SetDefaultHeightAndWidthIntoRootDom(JNIEnv* env, jobject jcaller,
    jstring instanceId,
    jfloat defaultWidth,
    jfloat defaultHeight);

static void PrintFirstScreenLog(JNIEnv* env, jobject jcaller,
    jstring instanceId);

static void PrintRenderSuccessLog(JNIEnv* env, jobject jcaller,
    jstring instanceId);

// Step 2: method stubs.

static intptr_t g_WXSDKInstance_getInstanceByID = 0;
static base::android::ScopedLocalJavaRef<jobject>
    Java_WXSDKInstance_getInstanceByID(JNIEnv* env, jstring instanceId) {
  /* Must call RegisterNativesImpl()  */
  //CHECK_CLAZZ(env, WXSDKInstance_clazz(env),
  //    WXSDKInstance_clazz(env), NULL);
  jmethodID method_id =
      base::android::GetMethod(
      env, WXSDKInstance_clazz(env),
      base::android::STATIC_METHOD,
      "getInstanceByID",

"("
"Ljava/lang/String;"
")"
"Lcom/taobao/weex/WXSDKInstance;",
      &g_WXSDKInstance_getInstanceByID);

  jobject ret =
      env->CallStaticObjectMethod(WXSDKInstance_clazz(env),
          method_id, instanceId);
  base::android::CheckException(env);
  return base::android::ScopedLocalJavaRef<jobject>(env, ret);
}

// Step 3: RegisterNatives.

static const JNINativeMethod kMethodsWXSDKInstance[] = {
    { "nativeBindComponentToWXCore",
"("
"Ljava/lang/String;"
"Lcom/taobao/weex/ui/component/WXComponent;"
"Ljava/lang/String;"
")"
"V", reinterpret_cast<void*>(BindComponentToWXCore) },
    { "nativeBindInstanceToWXCore",
"("
"Ljava/lang/String;"
"Lcom/taobao/weex/WXSDKInstance;"
")"
"V", reinterpret_cast<void*>(BindInstanceToWXCore) },
    { "nativeOnInstanceClose",
"("
"Ljava/lang/String;"
")"
"V", reinterpret_cast<void*>(OnInstanceClose) },
    { "nativeSetDefaultHeightAndWidthIntoRootDom",
"("
"Ljava/lang/String;"
"F"
"F"
")"
"V", reinterpret_cast<void*>(SetDefaultHeightAndWidthIntoRootDom) },
    { "nativePrintFirstScreenLog",
"("
"Ljava/lang/String;"
")"
"V", reinterpret_cast<void*>(PrintFirstScreenLog) },
    { "nativePrintRenderSuccessLog",
"("
"Ljava/lang/String;"
")"
"V", reinterpret_cast<void*>(PrintRenderSuccessLog) },
};

static bool RegisterNativesImpl(JNIEnv* env) {

  g_WXSDKInstance_clazz = reinterpret_cast<jclass>(env->NewGlobalRef(
      base::android::GetClass(env, kWXSDKInstanceClassPath).Get()));

  const int kMethodsWXSDKInstanceSize =
      sizeof(kMethodsWXSDKInstance)/sizeof(kMethodsWXSDKInstance[0]);

  if (env->RegisterNatives(WXSDKInstance_clazz(env),
                           kMethodsWXSDKInstance,
                           kMethodsWXSDKInstanceSize) < 0) {
    //jni_generator::HandleRegistrationError(
    //    env, WXSDKInstance_clazz(env), __FILE__);
    return false;
  }

  return true;
}

#endif  // com_taobao_weex_WXSDKInstance_JNI
