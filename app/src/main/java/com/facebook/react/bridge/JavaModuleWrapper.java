package com.facebook.react.bridge;

import android.os.Trace;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.InterfaceC0965PK;
import p000.MT1;
import p000.O90;

@InterfaceC0965PK
/* loaded from: classes.dex */
class JavaModuleWrapper {
    private final JSInstance mJSInstance;
    private final ModuleHolder mModuleHolder;
    private final ArrayList<NativeMethod> mMethods = new ArrayList<>();
    private final ArrayList<MethodDescriptor> mDescs = new ArrayList<>();

    @InterfaceC0965PK
    public static class MethodDescriptor {

        @InterfaceC0965PK
        Method method;

        @InterfaceC0965PK
        String name;

        @InterfaceC0965PK
        String signature;

        @InterfaceC0965PK
        String type;
    }

    public interface NativeMethod {
        String getType();

        void invoke(JSInstance jSInstance, ReadableArray readableArray);
    }

    public JavaModuleWrapper(JSInstance jSInstance, ModuleHolder moduleHolder) {
        this.mJSInstance = jSInstance;
        this.mModuleHolder = moduleHolder;
    }

    @InterfaceC0965PK
    private void findMethods() throws SecurityException {
        MT1.m5371b("findMethods");
        Class<?> cls = this.mModuleHolder.getModule().getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (TurboModule.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                MethodDescriptor methodDescriptor = new MethodDescriptor();
                JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                methodDescriptor.name = name;
                String type = javaMethodWrapper.getType();
                methodDescriptor.type = type;
                if (BaseJavaModule.METHOD_TYPE_SYNC.equals(type)) {
                    methodDescriptor.signature = javaMethodWrapper.getSignature();
                    methodDescriptor.method = method;
                }
                this.mMethods.add(javaMethodWrapper);
                this.mDescs.add(methodDescriptor);
            }
        }
        Trace.endSection();
    }

    @InterfaceC0965PK
    public NativeMap getConstants() {
        String name = getName();
        ArrayList arrayList = new ArrayList();
        O90.m5968f(name, "value");
        arrayList.add("moduleName: " + name.toString());
        MT1.m5371b("JavaModuleWrapper.getConstants".concat(""));
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        MT1.m5371b("module.getConstants");
        Map<String, Object> constants = module.getConstants();
        Trace.endSection();
        MT1.m5371b("create WritableNativeMap");
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            return Arguments.makeNativeMap(constants);
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, name);
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END, name);
            Trace.endSection();
        }
    }

    @InterfaceC0965PK
    public List<MethodDescriptor> getMethodDescriptors() throws SecurityException {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    @InterfaceC0965PK
    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    @InterfaceC0965PK
    public String getName() {
        return this.mModuleHolder.getName();
    }

    @InterfaceC0965PK
    public void invoke(int i, ReadableNativeArray readableNativeArray) {
        if (i >= this.mMethods.size()) {
            return;
        }
        this.mMethods.get(i).invoke(this.mJSInstance, readableNativeArray);
    }
}
