package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8839bK1 extends AbstractC10714px1 implements MJ1 {
    public C8839bK1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 2);
    }

    @Override // p000.MJ1
    /* renamed from: B */
    public final void mo5307B(EY1 ey1, C10588oy1 c10588oy1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        AbstractC10364nC1.m23102c(parcelM23898G, c10588oy1);
        m23903L(30, parcelM23898G);
    }

    @Override // p000.MJ1
    /* renamed from: D */
    public final C7781Iz1 mo5308D(EY1 ey1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        Parcel parcelM23901J = m23901J(21, parcelM23898G);
        C7781Iz1 c7781Iz1 = (C7781Iz1) AbstractC10364nC1.m23100a(parcelM23901J, C7781Iz1.CREATOR);
        parcelM23901J.recycle();
        return c7781Iz1;
    }

    @Override // p000.MJ1
    /* renamed from: E */
    public final void mo5309E(EY1 ey1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        m23903L(25, parcelM23898G);
    }

    @Override // p000.MJ1
    /* renamed from: F */
    public final void mo5310F(EY1 ey1, Bundle bundle, XJ1 xj1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        AbstractC10364nC1.m23102c(parcelM23898G, bundle);
        AbstractC10364nC1.m23101b(parcelM23898G, xj1);
        m23903L(31, parcelM23898G);
    }

    @Override // p000.MJ1
    /* renamed from: a */
    public final List mo5311a(Bundle bundle, EY1 ey1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        AbstractC10364nC1.m23102c(parcelM23898G, bundle);
        Parcel parcelM23901J = m23901J(24, parcelM23898G);
        ArrayList arrayListCreateTypedArrayList = parcelM23901J.createTypedArrayList(C11938zX1.CREATOR);
        parcelM23901J.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.MJ1
    /* renamed from: b */
    public final void mo5313b(EY1 ey1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        m23903L(20, parcelM23898G);
    }

    @Override // p000.MJ1
    /* renamed from: c */
    public final void mo5314c(String str, String str2, long j, String str3) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeLong(j);
        parcelM23898G.writeString(str);
        parcelM23898G.writeString(str2);
        parcelM23898G.writeString(str3);
        m23903L(10, parcelM23898G);
    }

    @Override // p000.MJ1
    /* renamed from: d */
    public final void mo5315d(C9898jZ1 c9898jZ1, EY1 ey1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, c9898jZ1);
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        m23903L(2, parcelM23898G);
    }

    @Override // p000.MJ1
    /* renamed from: e */
    public final List mo5316e(String str, String str2, String str3, boolean z) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeString(null);
        parcelM23898G.writeString(str2);
        parcelM23898G.writeString(str3);
        ClassLoader classLoader = AbstractC10364nC1.f38178a;
        parcelM23898G.writeInt(z ? 1 : 0);
        Parcel parcelM23901J = m23901J(15, parcelM23898G);
        ArrayList arrayListCreateTypedArrayList = parcelM23901J.createTypedArrayList(C9898jZ1.CREATOR);
        parcelM23901J.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.MJ1
    /* renamed from: g */
    public final void mo5317g(C7571Ey1 c7571Ey1, EY1 ey1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, c7571Ey1);
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        m23903L(12, parcelM23898G);
    }

    @Override // p000.MJ1
    /* renamed from: h */
    public final void mo5318h(EY1 ey1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        m23903L(26, parcelM23898G);
    }

    @Override // p000.MJ1
    /* renamed from: j */
    public final List mo5319j(String str, String str2, EY1 ey1) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeString(str);
        parcelM23898G.writeString(str2);
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        Parcel parcelM23901J = m23901J(16, parcelM23898G);
        ArrayList arrayListCreateTypedArrayList = parcelM23901J.createTypedArrayList(C7571Ey1.CREATOR);
        parcelM23901J.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.MJ1
    /* renamed from: k */
    public final void mo5320k(EY1 ey1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        m23903L(4, parcelM23898G);
    }

    @Override // p000.MJ1
    /* renamed from: l */
    public final List mo5321l(String str, String str2, boolean z, EY1 ey1) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeString(str);
        parcelM23898G.writeString(str2);
        ClassLoader classLoader = AbstractC10364nC1.f38178a;
        parcelM23898G.writeInt(z ? 1 : 0);
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        Parcel parcelM23901J = m23901J(14, parcelM23898G);
        ArrayList arrayListCreateTypedArrayList = parcelM23901J.createTypedArrayList(C9898jZ1.CREATOR);
        parcelM23901J.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.MJ1
    /* renamed from: n */
    public final List mo5322n(String str, String str2, String str3) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeString(null);
        parcelM23898G.writeString(str2);
        parcelM23898G.writeString(str3);
        Parcel parcelM23901J = m23901J(17, parcelM23898G);
        ArrayList arrayListCreateTypedArrayList = parcelM23901J.createTypedArrayList(C7571Ey1.CREATOR);
        parcelM23901J.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.MJ1
    /* renamed from: o */
    public final void mo5323o(EY1 ey1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        m23903L(18, parcelM23898G);
    }

    @Override // p000.MJ1
    /* renamed from: q */
    public final void mo5324q(EY1 ey1, VX1 vx1, InterfaceC9230eL1 interfaceC9230eL1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        AbstractC10364nC1.m23102c(parcelM23898G, vx1);
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC9230eL1);
        m23903L(29, parcelM23898G);
    }

    @Override // p000.MJ1
    /* renamed from: s */
    public final String mo5325s(EY1 ey1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        Parcel parcelM23901J = m23901J(11, parcelM23898G);
        String string = parcelM23901J.readString();
        parcelM23901J.recycle();
        return string;
    }

    @Override // p000.MJ1
    /* renamed from: u */
    public final void mo5326u(EY1 ey1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        m23903L(27, parcelM23898G);
    }

    @Override // p000.MJ1
    /* renamed from: w */
    public final byte[] mo5327w(String str, C11894zB1 c11894zB1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, c11894zB1);
        parcelM23898G.writeString(str);
        Parcel parcelM23901J = m23901J(9, parcelM23898G);
        byte[] bArrCreateByteArray = parcelM23901J.createByteArray();
        parcelM23901J.recycle();
        return bArrCreateByteArray;
    }

    @Override // p000.MJ1
    /* renamed from: y */
    public final void mo5328y(C11894zB1 c11894zB1, EY1 ey1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, c11894zB1);
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        m23903L(1, parcelM23898G);
    }

    @Override // p000.MJ1
    /* renamed from: z */
    public final void mo5329z(EY1 ey1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        m23903L(6, parcelM23898G);
    }

    @Override // p000.MJ1
    /* renamed from: a */
    public final void mo5312a(Bundle bundle, EY1 ey1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, bundle);
        AbstractC10364nC1.m23102c(parcelM23898G, ey1);
        m23903L(19, parcelM23898G);
    }
}
