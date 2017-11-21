#include <base/android/jni/android_jni.h>
#include "WXComponent_Impl_Android.h"
#include <gen/WXComponent_jni.h>
#include <WeexCore/platform/android/WeexCore.h>
#include <WeexCore/render/RenderManager.h>
#include <WeexCore/render/RenderPage.h>
#include <WeexCore/render/RenderObject.h>

namespace WeexCore {
  bool RegisterJNIWXComponent(JNIEnv *env) {
    return RegisterNativesImpl(env);
  }
}

static void BindMeasurementToWXCore(JNIEnv *env, jobject jcaller,
                                    jstring instanceId,
                                    jstring ref,
                                    jobject contentBoxMeasurement) {
  RenderPage *page = RenderManager::getInstance()->getPage(jString2Str(env, instanceId));
  RenderObject *render = page->getRenderObject(jString2Str(env, ref));
  render->bindMeasureFunc_Impl_Android(contentBoxMeasurement);
}