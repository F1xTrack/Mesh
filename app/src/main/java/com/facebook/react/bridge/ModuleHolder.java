package com.facebook.react.bridge;

import android.os.Trace;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import p000.InterfaceC0965PK;
import p000.MT1;
import p000.O90;
import p000.UJ0;
import p000.UN1;

@InterfaceC0965PK
/* loaded from: classes.dex */
public class ModuleHolder {
    private static final AtomicInteger sInstanceKeyCounter = new AtomicInteger(1);
    private boolean mInitializable;
    private final int mInstanceKey = sInstanceKeyCounter.getAndIncrement();
    private boolean mIsCreating;
    private boolean mIsInitializing;
    private NativeModule mModule;
    private final String mName;
    private Provider mProvider;
    private final ReactModuleInfo mReactModuleInfo;

    public ModuleHolder(ReactModuleInfo reactModuleInfo, Provider provider) {
        this.mName = reactModuleInfo.f17914a;
        this.mProvider = provider;
        this.mReactModuleInfo = reactModuleInfo;
        if (reactModuleInfo.f17917d) {
            this.mModule = create();
        }
    }

    private NativeModule create() {
        boolean z;
        SoftAssertions.assertCondition(this.mModule == null, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.mName, this.mInstanceKey);
        ArrayList arrayList = new ArrayList();
        String str = this.mName;
        O90.m5968f(str, "value");
        arrayList.add("name: " + str.toString());
        MT1.m5371b("ModuleHolder.createModule".concat(""));
        O90.m5968f(UJ0.f11734c, "tag");
        try {
            Provider provider = this.mProvider;
            UN1.m7999c(provider);
            NativeModule nativeModule = (NativeModule) provider.get();
            this.mProvider = null;
            synchronized (this) {
                try {
                    this.mModule = nativeModule;
                    z = this.mInitializable && !this.mIsInitializing;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                doInitialize(nativeModule);
            }
            return nativeModule;
        } finally {
        }
    }

    private void doInitialize(NativeModule nativeModule) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        String str = this.mName;
        O90.m5968f(str, "value");
        arrayList.add("name: " + str.toString());
        MT1.m5371b("ModuleHolder.initialize".concat(""));
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.mName, this.mInstanceKey);
        try {
            synchronized (this) {
                try {
                    if (!this.mInitializable || this.mIsInitializing) {
                        z = false;
                    } else {
                        z = true;
                        this.mIsInitializing = true;
                    }
                } finally {
                }
            }
            if (z) {
                nativeModule.initialize();
                synchronized (this) {
                    this.mIsInitializing = false;
                }
            }
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mName, this.mInstanceKey);
            Trace.endSection();
        }
    }

    public synchronized void destroy() {
        NativeModule nativeModule = this.mModule;
        if (nativeModule != null) {
            nativeModule.invalidate();
        }
    }

    public boolean getCanOverrideExistingModule() {
        return this.mReactModuleInfo.f17916c;
    }

    public String getClassName() {
        return this.mReactModuleInfo.f17915b;
    }

    @InterfaceC0965PK
    public NativeModule getModule() {
        boolean z;
        NativeModule nativeModule;
        synchronized (this) {
            try {
                NativeModule nativeModule2 = this.mModule;
                if (nativeModule2 != null) {
                    return nativeModule2;
                }
                if (this.mIsCreating) {
                    z = false;
                } else {
                    z = true;
                    this.mIsCreating = true;
                }
                if (z) {
                    NativeModule nativeModuleCreate = create();
                    synchronized (this) {
                        this.mIsCreating = false;
                        notifyAll();
                    }
                    return nativeModuleCreate;
                }
                synchronized (this) {
                    while (true) {
                        nativeModule = this.mModule;
                        if (nativeModule != null || !this.mIsCreating) {
                            break;
                        }
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    UN1.m7999c(nativeModule);
                }
                return nativeModule;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC0965PK
    public String getName() {
        return this.mName;
    }

    public synchronized boolean hasInstance() {
        return this.mModule != null;
    }

    public boolean isCxxModule() {
        return this.mReactModuleInfo.f17918e;
    }

    public boolean isTurboModule() {
        return this.mReactModuleInfo.f17919f;
    }

    public void markInitializable() {
        boolean z;
        NativeModule nativeModule;
        synchronized (this) {
            z = true;
            try {
                this.mInitializable = true;
                if (this.mModule != null) {
                    UN1.m7997a(!this.mIsInitializing);
                    nativeModule = this.mModule;
                } else {
                    nativeModule = null;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            doInitialize(nativeModule);
        }
    }

    public ModuleHolder(NativeModule nativeModule) {
        this.mName = nativeModule.getName();
        this.mReactModuleInfo = new ReactModuleInfo(nativeModule.getName(), nativeModule.getClass().getSimpleName(), nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(nativeModule.getClass()), TurboModule.class.isAssignableFrom(nativeModule.getClass()));
        this.mModule = nativeModule;
        O90.m5968f(UJ0.f11734c, "tag");
    }
}
