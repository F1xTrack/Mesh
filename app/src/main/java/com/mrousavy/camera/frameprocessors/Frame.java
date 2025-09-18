package com.mrousavy.camera.frameprocessors;

import android.media.Image;
import android.os.Build;
import p000.C11814yZ0;
import p000.C6640po;
import p000.C6838sg;
import p000.C7356Av0;
import p000.EnumC10105lB0;
import p000.EnumC8038Ny0;
import p000.InterfaceC0965PK;
import p000.OJ1;

/* loaded from: classes2.dex */
public final class Frame {

    /* renamed from: a */
    public final C11814yZ0 f19669a;

    /* renamed from: b */
    public int f19670b = 0;

    public Frame(C11814yZ0 c11814yZ0) {
        this.f19669a = c11814yZ0;
    }

    @InterfaceC0965PK
    private Object getHardwareBufferBoxed() throws C6640po {
        if (Build.VERSION.SDK_INT < 28) {
            throw new C6640po("system", "hardware-buffers-unavailable", "HardwareBuffers are only available on API 28 or higher!", null);
        }
        m12743a();
        m12743a();
        Image imageMo18404Z = this.f19669a.f46285b.mo18404Z();
        if (imageMo18404Z != null) {
            return imageMo18404Z.getHardwareBuffer();
        }
        throw new C6640po(12, false);
    }

    /* renamed from: a */
    public final void m12743a() throws C6640po {
        C11814yZ0 c11814yZ0 = this.f19669a;
        synchronized (this) {
            if (this.f19670b > 0) {
                try {
                    c11814yZ0.mo18405j0();
                    return;
                } catch (IllegalStateException unused) {
                }
            }
            throw new C6640po(12, false);
        }
    }

    @InterfaceC0965PK
    public synchronized void decrementRefCount() {
        int i = this.f19670b - 1;
        this.f19670b = i;
        if (i <= 0) {
            this.f19669a.close();
        }
    }

    @InterfaceC0965PK
    public int getBytesPerRow() throws C6640po {
        m12743a();
        return this.f19669a.f46285b.mo18406u()[0].m2891H();
    }

    @InterfaceC0965PK
    public int getHeight() throws C6640po {
        m12743a();
        return this.f19669a.f46310g;
    }

    @InterfaceC0965PK
    public boolean getIsMirrored() throws C6640po {
        m12743a();
        float[] fArr = new float[9];
        this.f19669a.f46308e.mo4566d().getValues(fArr);
        return fArr[0] < 0.0f;
    }

    @InterfaceC0965PK
    public boolean getIsValid() {
        C11814yZ0 c11814yZ0 = this.f19669a;
        synchronized (this) {
            if (this.f19670b <= 0) {
                return false;
            }
            try {
                c11814yZ0.mo18405j0();
                return true;
            } catch (IllegalStateException unused) {
                return false;
            }
        }
    }

    @InterfaceC0965PK
    public EnumC8038Ny0 getOrientation() throws C6640po {
        m12743a();
        int iMo4565c = this.f19669a.f46308e.mo4565c();
        EnumC8038Ny0.f8146b.getClass();
        int iOrdinal = C7356Av0.m372A(iMo4565c).ordinal();
        if (iOrdinal == 0) {
            return EnumC8038Ny0.f8147c;
        }
        if (iOrdinal == 1) {
            return EnumC8038Ny0.f8150f;
        }
        if (iOrdinal == 2) {
            return EnumC8038Ny0.f8149e;
        }
        if (iOrdinal == 3) {
            return EnumC8038Ny0.f8148d;
        }
        throw new C6838sg();
    }

    @InterfaceC0965PK
    public EnumC10105lB0 getPixelFormat() throws C6640po {
        m12743a();
        OJ1 oj1 = EnumC10105lB0.f36939b;
        int iMo18405j0 = this.f19669a.f46285b.mo18405j0();
        oj1.getClass();
        if (iMo18405j0 == 1) {
            return EnumC10105lB0.f36941d;
        }
        if (iMo18405j0 == 35) {
            return EnumC10105lB0.f36940c;
        }
        if (iMo18405j0 == 3 || iMo18405j0 == 4 || iMo18405j0 == 16 || iMo18405j0 != 17) {
        }
        return EnumC10105lB0.f36942e;
    }

    @InterfaceC0965PK
    public int getPlanesCount() throws C6640po {
        m12743a();
        return this.f19669a.f46285b.mo18406u().length;
    }

    @InterfaceC0965PK
    public long getTimestamp() throws C6640po {
        m12743a();
        return this.f19669a.f46308e.getTimestamp();
    }

    @InterfaceC0965PK
    public int getWidth() throws C6640po {
        m12743a();
        return this.f19669a.f46309f;
    }

    @InterfaceC0965PK
    public synchronized void incrementRefCount() {
        this.f19670b++;
    }
}
