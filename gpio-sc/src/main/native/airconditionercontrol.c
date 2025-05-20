#include <jni.h>
#include <stdio.h>
#include "AirConditionerControl.h"

// Simulating control of a light (real implementation could use GPIO, etc.)
JNIEXPORT void JNICALL Java_AirConditioner_toggleAirConditioner
  (JNIEnv *env, jobject obj, jboolean on) {
    if (on) {
        printf("🔆 AirConditioner is now ON\n");
        // You could place GPIO control code here for a real appliance.
    } else {
        printf("💡 AirConditioner is now OFF\n");
    }
}