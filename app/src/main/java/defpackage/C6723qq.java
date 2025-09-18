package defpackage;

import java.util.List;

/* renamed from: qq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6723qq implements InterfaceC5925me1 {
    public final InterfaceC5925me1 a;
    public final InterfaceC1165Os b;
    public final int c;

    public C6723qq(InterfaceC5925me1 interfaceC5925me1, InterfaceC1165Os interfaceC1165Os, int i) {
        O90.f(interfaceC1165Os, "declarationDescriptor");
        this.a = interfaceC5925me1;
        this.b = interfaceC1165Os;
        this.c = i;
    }

    @Override // defpackage.InterfaceC5925me1
    public final boolean D() {
        return this.a.D();
    }

    @Override // defpackage.InterfaceC5925me1
    public final EnumC4015gi1 O() {
        return this.a.O();
    }

    @Override // defpackage.CD
    public final Object Z(GD gd, Object obj) {
        return this.a.Z(gd, obj);
    }

    @Override // defpackage.InterfaceC1087Ns, defpackage.CD
    /* renamed from: a */
    public final InterfaceC1087Ns x1() {
        return this.a.x1();
    }

    @Override // defpackage.ED
    public final W21 e() {
        return this.a.e();
    }

    @Override // defpackage.InterfaceC6391p5
    public final I5 getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.InterfaceC5925me1
    public final int getIndex() {
        return this.a.getIndex() + this.c;
    }

    @Override // defpackage.CD
    public final C1559Tt0 getName() {
        return this.a.getName();
    }

    @Override // defpackage.InterfaceC5925me1
    public final Z41 getStorageManager() {
        return this.a.getStorageManager();
    }

    @Override // defpackage.InterfaceC5925me1
    public final List getUpperBounds() {
        return this.a.getUpperBounds();
    }

    @Override // defpackage.CD
    public final CD i() {
        return this.b;
    }

    @Override // defpackage.InterfaceC1087Ns
    public final X01 m() {
        return this.a.m();
    }

    public final String toString() {
        return this.a + "[inner-copy]";
    }

    @Override // defpackage.InterfaceC1087Ns
    public final InterfaceC1200Pd1 v() {
        return this.a.v();
    }

    @Override // defpackage.InterfaceC5925me1
    public final boolean v0() {
        return true;
    }

    @Override // defpackage.CD
    /* renamed from: a */
    public final CD x1() {
        return this.a.x1();
    }

    @Override // defpackage.InterfaceC5925me1, defpackage.InterfaceC1087Ns, defpackage.CD
    /* renamed from: a */
    public final InterfaceC5925me1 x1() {
        return this.a.x1();
    }
}
