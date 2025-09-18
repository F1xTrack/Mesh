package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2305bK1 extends AbstractC6555px1 implements MJ1 {
    public C2305bK1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 2);
    }

    @Override // defpackage.MJ1
    public final void B(EY1 ey1, C6367oy1 c6367oy1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, ey1);
        AbstractC6032nC1.c(parcelG, c6367oy1);
        L(30, parcelG);
    }

    @Override // defpackage.MJ1
    public final C0721Iz1 D(EY1 ey1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, ey1);
        Parcel parcelJ = J(21, parcelG);
        C0721Iz1 c0721Iz1 = (C0721Iz1) AbstractC6032nC1.a(parcelJ, C0721Iz1.CREATOR);
        parcelJ.recycle();
        return c0721Iz1;
    }

    @Override // defpackage.MJ1
    public final void E(EY1 ey1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, ey1);
        L(25, parcelG);
    }

    @Override // defpackage.MJ1
    public final void F(EY1 ey1, Bundle bundle, XJ1 xj1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, ey1);
        AbstractC6032nC1.c(parcelG, bundle);
        AbstractC6032nC1.b(parcelG, xj1);
        L(31, parcelG);
    }

    @Override // defpackage.MJ1
    public final List a(Bundle bundle, EY1 ey1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, ey1);
        AbstractC6032nC1.c(parcelG, bundle);
        Parcel parcelJ = J(24, parcelG);
        ArrayList arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(C8382zX1.CREATOR);
        parcelJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.MJ1
    public final void b(EY1 ey1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, ey1);
        L(20, parcelG);
    }

    @Override // defpackage.MJ1
    public final void c(String str, String str2, long j, String str3) {
        Parcel parcelG = G();
        parcelG.writeLong(j);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        L(10, parcelG);
    }

    @Override // defpackage.MJ1
    public final void d(C5337jZ1 c5337jZ1, EY1 ey1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, c5337jZ1);
        AbstractC6032nC1.c(parcelG, ey1);
        L(2, parcelG);
    }

    @Override // defpackage.MJ1
    public final List e(String str, String str2, String str3, boolean z) {
        Parcel parcelG = G();
        parcelG.writeString(null);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        ClassLoader classLoader = AbstractC6032nC1.a;
        parcelG.writeInt(z ? 1 : 0);
        Parcel parcelJ = J(15, parcelG);
        ArrayList arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(C5337jZ1.CREATOR);
        parcelJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.MJ1
    public final void g(C0406Ey1 c0406Ey1, EY1 ey1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, c0406Ey1);
        AbstractC6032nC1.c(parcelG, ey1);
        L(12, parcelG);
    }

    @Override // defpackage.MJ1
    public final void h(EY1 ey1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, ey1);
        L(26, parcelG);
    }

    @Override // defpackage.MJ1
    public final List j(String str, String str2, EY1 ey1) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        AbstractC6032nC1.c(parcelG, ey1);
        Parcel parcelJ = J(16, parcelG);
        ArrayList arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(C0406Ey1.CREATOR);
        parcelJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.MJ1
    public final void k(EY1 ey1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, ey1);
        L(4, parcelG);
    }

    @Override // defpackage.MJ1
    public final List l(String str, String str2, boolean z, EY1 ey1) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        ClassLoader classLoader = AbstractC6032nC1.a;
        parcelG.writeInt(z ? 1 : 0);
        AbstractC6032nC1.c(parcelG, ey1);
        Parcel parcelJ = J(14, parcelG);
        ArrayList arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(C5337jZ1.CREATOR);
        parcelJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.MJ1
    public final List n(String str, String str2, String str3) {
        Parcel parcelG = G();
        parcelG.writeString(null);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        Parcel parcelJ = J(17, parcelG);
        ArrayList arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(C0406Ey1.CREATOR);
        parcelJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.MJ1
    public final void o(EY1 ey1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, ey1);
        L(18, parcelG);
    }

    @Override // defpackage.MJ1
    public final void q(EY1 ey1, VX1 vx1, InterfaceC3564eL1 interfaceC3564eL1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, ey1);
        AbstractC6032nC1.c(parcelG, vx1);
        AbstractC6032nC1.b(parcelG, interfaceC3564eL1);
        L(29, parcelG);
    }

    @Override // defpackage.MJ1
    public final String s(EY1 ey1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, ey1);
        Parcel parcelJ = J(11, parcelG);
        String string = parcelJ.readString();
        parcelJ.recycle();
        return string;
    }

    @Override // defpackage.MJ1
    public final void u(EY1 ey1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, ey1);
        L(27, parcelG);
    }

    @Override // defpackage.MJ1
    public final byte[] w(String str, C8316zB1 c8316zB1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, c8316zB1);
        parcelG.writeString(str);
        Parcel parcelJ = J(9, parcelG);
        byte[] bArrCreateByteArray = parcelJ.createByteArray();
        parcelJ.recycle();
        return bArrCreateByteArray;
    }

    @Override // defpackage.MJ1
    public final void y(C8316zB1 c8316zB1, EY1 ey1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, c8316zB1);
        AbstractC6032nC1.c(parcelG, ey1);
        L(1, parcelG);
    }

    @Override // defpackage.MJ1
    public final void z(EY1 ey1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, ey1);
        L(6, parcelG);
    }

    @Override // defpackage.MJ1
    /* renamed from: a */
    public final void mo1a(Bundle bundle, EY1 ey1) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, bundle);
        AbstractC6032nC1.c(parcelG, ey1);
        L(19, parcelG);
    }
}
