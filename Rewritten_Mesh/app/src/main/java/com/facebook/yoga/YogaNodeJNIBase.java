package com.facebook.yoga;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import p000.AbstractC11153tN0;
import p000.AbstractC7222ym;
import p000.C7391Bm1;
import p000.C8844bN0;
import p000.EnumC7813Jp1;
import p000.InterfaceC1028QK;
import p000.InterfaceC7761Ip1;
import p000.UN1;

@InterfaceC1028QK
/* loaded from: classes.dex */
public abstract class YogaNodeJNIBase implements Cloneable {

    /* renamed from: a */
    public YogaNodeJNIBase f17993a;

    @InterfaceC1028QK
    private float[] arr;

    /* renamed from: b */
    public ArrayList f17994b;

    /* renamed from: c */
    public InterfaceC7761Ip1 f17995c;

    /* renamed from: d */
    public C7391Bm1 f17996d;

    /* renamed from: e */
    public long f17997e;

    /* renamed from: f */
    public boolean f17998f;

    @InterfaceC1028QK
    private int mLayoutDirection;

    public YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f17998f = true;
        if (j == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f17997e = j;
    }

    /* renamed from: o */
    public static YogaValue m11091o(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) j);
        int i = (int) (j >> 32);
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Unknown enum value: "));
                    }
                    i2 = 4;
                }
            } else {
                i2 = 2;
            }
        }
        return new YogaValue(fIntBitsToFloat, i2);
    }

    @InterfaceC1028QK
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        ArrayList arrayList = this.f17994b;
        if (arrayList == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        arrayList.remove(i);
        this.f17994b.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.f17993a = this;
        return yogaNodeJNIBase.f17997e;
    }

    /* renamed from: a */
    public final int m11092a() {
        float[] fArr = this.arr;
        int i = fArr != null ? (int) fArr[5] : this.mLayoutDirection;
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Unknown enum value: "));
    }

    @InterfaceC1028QK
    public final float baseline(float f, float f2) {
        C8844bN0 c8844bN0 = (C8844bN0) this.f17996d.f1022b;
        SpannableStringBuilder spannableStringBuilder = c8844bN0.f16999a0;
        UN1.m8000d(spannableStringBuilder, "Spannable element has not been prepared in onBeforeLayout");
        Layout layoutM10450L = C8844bN0.m10450L(c8844bN0, spannableStringBuilder, f, EnumC7813Jp1.f5716b);
        return layoutM10450L.getLineBaseline(layoutM10450L.getLineCount() - 1);
    }

    /* renamed from: e */
    public final float m11093e() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    /* renamed from: f */
    public final float m11094f(int i) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i2 = (int) fArr[0];
        if ((i2 & 2) != 2) {
            return 0.0f;
        }
        int i3 = (i2 & 1) != 1 ? 4 : 0;
        int i4 = 10 - i3;
        int iM26247x = AbstractC7222ym.m26247x(i);
        if (iM26247x == 0) {
            return this.arr[i4];
        }
        if (iM26247x == 1) {
            return this.arr[11 - i3];
        }
        if (iM26247x == 2) {
            return this.arr[12 - i3];
        }
        if (iM26247x == 3) {
            return this.arr[13 - i3];
        }
        if (iM26247x == 4) {
            return m11092a() == 3 ? this.arr[12 - i3] : this.arr[i4];
        }
        if (iM26247x == 5) {
            return m11092a() == 3 ? this.arr[i4] : this.arr[12 - i3];
        }
        throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
    }

    /* renamed from: h */
    public final float m11095h() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    /* renamed from: i */
    public final float m11096i() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    /* renamed from: j */
    public final float m11097j() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    /* renamed from: k */
    public final boolean m11098k() {
        float[] fArr = this.arr;
        return fArr != null ? (((int) fArr[0]) & 16) == 16 : this.f17998f;
    }

    /* renamed from: l */
    public final void m11099l() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f17998f = false;
    }

    /* renamed from: m */
    public final void m11100m(int i) {
        ArrayList arrayList = this.f17994b;
        if (arrayList == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.remove(i);
        yogaNodeJNIBase.f17993a = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.f17997e, yogaNodeJNIBase.f17997e);
    }

    @InterfaceC1028QK
    public final long measure(float f, int i, float f2, int i2) {
        InterfaceC7761Ip1 interfaceC7761Ip1 = this.f17995c;
        if (interfaceC7761Ip1 != null) {
            return interfaceC7761Ip1.mo4023a0(this, f, EnumC7813Jp1.m4446a(i), f2, EnumC7813Jp1.m4446a(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    /* renamed from: n */
    public final void m11101n() {
        this.f17995c = null;
        this.f17996d = null;
        this.arr = null;
        this.f17998f = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f17997e);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }
}
