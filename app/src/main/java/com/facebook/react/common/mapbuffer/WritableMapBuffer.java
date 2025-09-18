package com.facebook.react.common.mapbuffer;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.Metadata;
import p000.AbstractC11153tN0;
import p000.C3978eF;
import p000.C6653q0;
import p000.InterfaceC0965PK;
import p000.InterfaceC8534Xm0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m22267d2 = {"Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;", "LXm0;", "<init>", "()V", "", "getKeys", "()[I", "", "", "getValues", "()[Ljava/lang/Object;", "lp1", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
@InterfaceC0965PK
/* loaded from: classes.dex */
public final class WritableMapBuffer implements InterfaceC8534Xm0 {

    /* renamed from: a */
    public final SparseArray f17902a = new SparseArray();

    static {
        C3978eF.m17883a();
    }

    @InterfaceC0965PK
    private final int[] getKeys() {
        SparseArray sparseArray = this.f17902a;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        return iArr;
    }

    @InterfaceC0965PK
    private final Object[] getValues() {
        SparseArray sparseArray = this.f17902a;
        int size = sparseArray.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            Object objValueAt = sparseArray.valueAt(i);
            O90.m5967e(objValueAt, "valueAt(...)");
            objArr[i] = objValueAt;
        }
        return objArr;
    }

    @Override // p000.InterfaceC8534Xm0
    /* renamed from: J */
    public final boolean mo9114J(int i) {
        return this.f17902a.get(i) != null;
    }

    @Override // p000.InterfaceC8534Xm0
    /* renamed from: W */
    public final InterfaceC8534Xm0 mo9115W(int i) {
        Object obj = this.f17902a.get(i);
        if (obj == null) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Key not found: ").toString());
        }
        if (obj instanceof InterfaceC8534Xm0) {
            return (InterfaceC8534Xm0) obj;
        }
        throw new IllegalStateException(("Expected " + InterfaceC8534Xm0.class + " for key: " + i + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // p000.InterfaceC8534Xm0
    public final boolean getBoolean(int i) {
        Object obj = this.f17902a.get(i);
        if (obj == null) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Key not found: ").toString());
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + i + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // p000.InterfaceC8534Xm0
    /* renamed from: getCount */
    public final int getF17901c() {
        return this.f17902a.size();
    }

    @Override // p000.InterfaceC8534Xm0
    public final double getDouble(int i) {
        Object obj = this.f17902a.get(i);
        if (obj == null) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Key not found: ").toString());
        }
        if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        }
        throw new IllegalStateException(("Expected " + Double.class + " for key: " + i + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // p000.InterfaceC8534Xm0
    public final int getInt(int i) {
        Object obj = this.f17902a.get(i);
        if (obj == null) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Key not found: ").toString());
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        throw new IllegalStateException(("Expected " + Integer.class + " for key: " + i + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // p000.InterfaceC8534Xm0
    public final String getString(int i) {
        Object obj = this.f17902a.get(i);
        if (obj == null) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Key not found: ").toString());
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalStateException(("Expected " + String.class + " for key: " + i + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6653q0(4, this);
    }
}
