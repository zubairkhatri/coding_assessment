#include <jni.h>
#include <stdio.h>
#include "LightController.h"

// Simulating control of a light (real implementation could use GPIO, etc.)
JNIEXPORT void JNICALL Java_LightController_toggleLight
  (JNIEnv *env, jobject obj, jboolean on) {
    if (on) {
        printf("🔆 Light is now ON\n");
        // You could place GPIO control code here for a real appliance.
    } else {
        printf("💡 Light is now OFF\n");
    }
}
