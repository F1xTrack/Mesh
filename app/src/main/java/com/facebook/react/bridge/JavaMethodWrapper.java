package com.facebook.react.bridge;

import android.os.Trace;
import com.facebook.react.bridge.JavaModuleWrapper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p000.AbstractC11153tN0;
import p000.AbstractC7222ym;
import p000.C11370v32;
import p000.MT1;
import p000.O90;
import p000.UJ0;
import p000.UN1;

/* loaded from: classes.dex */
class JavaMethodWrapper implements JavaModuleWrapper.NativeMethod {
    private static final boolean DEBUG;
    private ArgumentExtractor[] mArgumentExtractors;
    private Object[] mArguments;
    private boolean mArgumentsProcessed = false;
    private int mJSArgumentsNeeded;
    private final Method mMethod;
    private final JavaModuleWrapper mModuleWrapper;
    private final int mParamLength;
    private final Class[] mParameterTypes;
    private String mSignature;
    private String mType;
    private static final ArgumentExtractor<Boolean> ARGUMENT_EXTRACTOR_BOOLEAN = new ArgumentExtractor<Boolean>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Boolean extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Boolean.valueOf(readableArray.getBoolean(i));
        }
    };
    private static final ArgumentExtractor<Double> ARGUMENT_EXTRACTOR_DOUBLE = new ArgumentExtractor<Double>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Double extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Double.valueOf(readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Float> ARGUMENT_EXTRACTOR_FLOAT = new ArgumentExtractor<Float>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Float extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Float.valueOf((float) readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Integer> ARGUMENT_EXTRACTOR_INTEGER = new ArgumentExtractor<Integer>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.4
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Integer extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Integer.valueOf((int) readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<String> ARGUMENT_EXTRACTOR_STRING = new ArgumentExtractor<String>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.5
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public String extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getString(i);
        }
    };
    private static final ArgumentExtractor<ReadableArray> ARGUMENT_EXTRACTOR_ARRAY = new ArgumentExtractor<ReadableArray>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.6
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableArray extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getArray(i);
        }
    };
    private static final ArgumentExtractor<Dynamic> ARGUMENT_EXTRACTOR_DYNAMIC = new ArgumentExtractor<Dynamic>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.7
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Dynamic extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return DynamicFromArray.create(readableArray, i);
        }
    };
    private static final ArgumentExtractor<ReadableMap> ARGUMENT_EXTRACTOR_MAP = new ArgumentExtractor<ReadableMap>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.8
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableMap extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getMap(i);
        }
    };
    private static final ArgumentExtractor<Callback> ARGUMENT_EXTRACTOR_CALLBACK = new ArgumentExtractor<Callback>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.9
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Callback extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            if (readableArray.isNull(i)) {
                return null;
            }
            return new CallbackImpl(jSInstance, (int) readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Promise> ARGUMENT_EXTRACTOR_PROMISE = new ArgumentExtractor<Promise>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.10
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public int getJSArgumentsNeeded() {
            return 2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Promise extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return new PromiseImpl((Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i), (Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i + 1));
        }
    };

    public static abstract class ArgumentExtractor<T> {
        public /* synthetic */ ArgumentExtractor(int i) {
            this();
        }

        public abstract T extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i);

        public int getJSArgumentsNeeded() {
            return 1;
        }

        private ArgumentExtractor() {
        }
    }

    static {
        O90.m5968f(UJ0.f11733b, "tag");
        DEBUG = false;
    }

    public JavaMethodWrapper(JavaModuleWrapper javaModuleWrapper, Method method, boolean z) throws SecurityException {
        this.mType = BaseJavaModule.METHOD_TYPE_ASYNC;
        this.mModuleWrapper = javaModuleWrapper;
        this.mMethod = method;
        method.setAccessible(true);
        Class<?>[] parameterTypes = method.getParameterTypes();
        this.mParameterTypes = parameterTypes;
        int length = parameterTypes.length;
        this.mParamLength = length;
        if (z) {
            this.mType = BaseJavaModule.METHOD_TYPE_SYNC;
        } else {
            if (length <= 0 || parameterTypes[length - 1] != Promise.class) {
                return;
            }
            this.mType = BaseJavaModule.METHOD_TYPE_PROMISE;
        }
    }

    private ArgumentExtractor[] buildArgumentExtractors(Class[] clsArr) {
        ArgumentExtractor[] argumentExtractorArr = new ArgumentExtractor[clsArr.length];
        int jSArgumentsNeeded = 0;
        while (jSArgumentsNeeded < clsArr.length) {
            Class cls = clsArr[jSArgumentsNeeded];
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_BOOLEAN;
            } else if (cls == Integer.class || cls == Integer.TYPE) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_INTEGER;
            } else if (cls == Double.class || cls == Double.TYPE) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_DOUBLE;
            } else if (cls == Float.class || cls == Float.TYPE) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_FLOAT;
            } else if (cls == String.class) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_STRING;
            } else if (cls == Callback.class) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_CALLBACK;
            } else if (cls == Promise.class) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_PROMISE;
                UN1.m7998b(jSArgumentsNeeded == clsArr.length - 1, "Promise must be used as last parameter only");
            } else if (cls == ReadableMap.class) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_MAP;
            } else if (cls == ReadableArray.class) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_ARRAY;
            } else {
                if (cls != Dynamic.class) {
                    throw new RuntimeException("Got unknown argument class: ".concat(cls.getSimpleName()));
                }
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_DYNAMIC;
            }
            jSArgumentsNeeded += argumentExtractorArr[jSArgumentsNeeded].getJSArgumentsNeeded();
        }
        return argumentExtractorArr;
    }

    private String buildSignature(Method method, Class[] clsArr, boolean z) {
        StringBuilder sb = new StringBuilder(clsArr.length + 2);
        if (z) {
            sb.append(returnTypeToChar(method.getReturnType()));
            sb.append('.');
        } else {
            sb.append("v.");
        }
        int i = 0;
        while (i < clsArr.length) {
            Class cls = clsArr[i];
            if (cls == Promise.class) {
                UN1.m7998b(i == clsArr.length - 1, "Promise must be used as last parameter only");
            }
            sb.append(paramTypeToChar(cls));
            i++;
        }
        return sb.toString();
    }

    private int calculateJSArgumentsNeeded() {
        ArgumentExtractor[] argumentExtractorArr = this.mArgumentExtractors;
        UN1.m7999c(argumentExtractorArr);
        int jSArgumentsNeeded = 0;
        for (ArgumentExtractor argumentExtractor : argumentExtractorArr) {
            jSArgumentsNeeded += argumentExtractor.getJSArgumentsNeeded();
        }
        return jSArgumentsNeeded;
    }

    private static char commonTypeToChar(Class cls) {
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return 'Z';
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        return cls == String.class ? 'S' : (char) 0;
    }

    private static String createInvokeExceptionMessage(String str) {
        return AbstractC7222ym.m26245v("Could not invoke ", str);
    }

    private String getAffectedRange(int i, int i2) {
        if (i2 <= 1) {
            return AbstractC11153tN0.m24909u(i, "");
        }
        StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "", "-");
        sbM26237n.append((i + i2) - 1);
        return sbM26237n.toString();
    }

    private static char paramTypeToChar(Class cls) {
        char cCommonTypeToChar = commonTypeToChar(cls);
        if (cCommonTypeToChar != 0) {
            return cCommonTypeToChar;
        }
        if (cls == Callback.class) {
            return 'X';
        }
        if (cls == Promise.class) {
            return 'P';
        }
        if (cls == ReadableMap.class) {
            return 'M';
        }
        if (cls == ReadableArray.class) {
            return 'A';
        }
        if (cls == Dynamic.class) {
            return 'Y';
        }
        throw new RuntimeException("Got unknown param class: ".concat(cls.getSimpleName()));
    }

    private void processArguments() {
        if (this.mArgumentsProcessed) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = this.mModuleWrapper.getName() + "." + this.mMethod.getName();
        O90.m5968f(str, "value");
        arrayList.add("method: " + str.toString());
        MT1.m5371b("processArguments".concat(""));
        try {
            this.mArgumentsProcessed = true;
            this.mArgumentExtractors = buildArgumentExtractors(this.mParameterTypes);
            this.mSignature = buildSignature(this.mMethod, this.mParameterTypes, this.mType.equals(BaseJavaModule.METHOD_TYPE_SYNC));
            this.mArguments = new Object[this.mParameterTypes.length];
            this.mJSArgumentsNeeded = calculateJSArgumentsNeeded();
        } finally {
            Trace.endSection();
        }
    }

    private static char returnTypeToChar(Class cls) {
        char cCommonTypeToChar = commonTypeToChar(cls);
        if (cCommonTypeToChar != 0) {
            return cCommonTypeToChar;
        }
        if (cls == Void.TYPE) {
            return 'v';
        }
        if (cls == WritableMap.class) {
            return 'M';
        }
        if (cls == WritableArray.class) {
            return 'A';
        }
        throw new RuntimeException("Got unknown return class: ".concat(cls.getSimpleName()));
    }

    public Method getMethod() {
        return this.mMethod;
    }

    public String getSignature() {
        if (!this.mArgumentsProcessed) {
            processArguments();
        }
        String str = this.mSignature;
        UN1.m7999c(str);
        return str;
    }

    @Override // com.facebook.react.bridge.JavaModuleWrapper.NativeMethod
    public String getType() {
        return this.mType;
    }

    @Override // com.facebook.react.bridge.JavaModuleWrapper.NativeMethod
    public void invoke(JSInstance jSInstance, ReadableArray readableArray) {
        String str = this.mModuleWrapper.getName() + "." + this.mMethod.getName();
        ArrayList arrayList = new ArrayList();
        O90.m5968f(str, "value");
        arrayList.add("method: " + str.toString());
        MT1.m5371b("callJavaModuleMethod".concat(""));
        if (DEBUG) {
            C11370v32 c11370v32 = UJ0.f11733b;
            this.mModuleWrapper.getName();
            this.mMethod.getName();
            O90.m5968f(c11370v32, "tag");
        }
        try {
            if (!this.mArgumentsProcessed) {
                processArguments();
            }
            if (this.mArguments == null || this.mArgumentExtractors == null) {
                throw new Error("processArguments failed");
            }
            if (this.mJSArgumentsNeeded != readableArray.size()) {
                throw new NativeArgumentsParseException(str + " got " + readableArray.size() + " arguments, expected " + this.mJSArgumentsNeeded);
            }
            int i = 0;
            int jSArgumentsNeeded = 0;
            while (true) {
                try {
                    ArgumentExtractor[] argumentExtractorArr = this.mArgumentExtractors;
                    if (i >= argumentExtractorArr.length) {
                        try {
                            this.mMethod.invoke(this.mModuleWrapper.getModule(), this.mArguments);
                            Trace.endSection();
                            return;
                        } catch (IllegalAccessException e) {
                            e = e;
                            throw new RuntimeException(createInvokeExceptionMessage(str), e);
                        } catch (IllegalArgumentException e2) {
                            e = e2;
                            throw new RuntimeException(createInvokeExceptionMessage(str), e);
                        } catch (InvocationTargetException e3) {
                            if (!(e3.getCause() instanceof RuntimeException)) {
                                throw new RuntimeException(createInvokeExceptionMessage(str), e3);
                            }
                            throw ((RuntimeException) e3.getCause());
                        }
                    }
                    this.mArguments[i] = argumentExtractorArr[i].extractArgument(jSInstance, readableArray, jSArgumentsNeeded);
                    jSArgumentsNeeded += this.mArgumentExtractors[i].getJSArgumentsNeeded();
                    i++;
                } catch (UnexpectedNativeTypeException | NullPointerException e4) {
                    throw new NativeArgumentsParseException(e4.getMessage() + " (constructing arguments for " + str + " at argument index " + getAffectedRange(jSArgumentsNeeded, this.mArgumentExtractors[i].getJSArgumentsNeeded()) + ")", e4);
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
