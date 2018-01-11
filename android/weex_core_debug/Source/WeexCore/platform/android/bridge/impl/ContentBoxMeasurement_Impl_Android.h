#ifndef WEEX_PROJECT_CONTENTBOXMEASUREMENT_IMPL_ANDROID_H
#define WEEX_PROJECT_CONTENTBOXMEASUREMENT_IMPL_ANDROID_H

#include <jni.h>
#include <WeexCore/platform/android/base/jni/android_jni.h>

namespace WeexCore {
  bool RegisterJNIContentBoxMeasurement(JNIEnv *env);

  base::android::ScopedLocalJavaRef<jobject>
  cumsmeasure_Imple_Android(JNIEnv *env, jobject measureFunc_Impl_Android, float &width,
                            float &height,
                            int &widthMeasureMode, int &heightMeasureMode);

  void LayoutBeforeImplAndroid(JNIEnv *env, jobject measureFunc_impl_android);

  void
  LayoutAfterImplAndroid(JNIEnv *env, jobject measureFunc_impl_android, float &width,
                         float &height);
}

#endif //WEEX_PROJECT_CONTENTBOXMEASUREMENT_IMPL_ANDROID_H
