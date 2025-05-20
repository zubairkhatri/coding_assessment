#include <jni.h>
#include <stdio.h>
#include "FanControl.h"

JNIEXPORT void JNICALL Java_FanController_setFanPosition
  (JNIEnv *env, jobject obj, jint position) {

    switch(position) {
        case 0:
            printf("🛑 Fan OFF - Speed 0\n");
            break;
        case 1:
            printf("🌀 Fan ON - Speed 1\n");
            break;
        case 2:
            printf("🌀 Fan ON - Speed 2\n");
            break;
        default:
            printf("❌ Invalid position: %d. Must be 0, 1, or 2.\n", position);
    }
}