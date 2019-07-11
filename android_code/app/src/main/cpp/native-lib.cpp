#include <jni.h>
#include <string>
#include "module_one.h"


extern "C"
JNIEXPORT jstring

JNICALL
Java_com_example_admin_testjni_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

JNIEXPORT void
JNICALL
Java_com_example_admin_testjni_MainActivity_setv(
        JNIEnv *env,
        jobject /* this */,
        jint value) {

    module_one module_one1;
    module_one1.setvalue(value);

    return ;
}


JNIEXPORT jint
JNICALL
Java_com_example_admin_testjni_MainActivity_getv(
        JNIEnv *env,
        jobject /* this */,
        jint value) {

    int u32_v = value;
    module_one module_one1;

    return module_one1.getvalue();
}


