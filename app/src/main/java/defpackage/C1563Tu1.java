package defpackage;

import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.base.exception.HostIsNotMasterException;

/* renamed from: Tu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1563Tu1 extends AbstractC4286i71 implements InterfaceC6099nZ {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1563Tu1(Object obj, Object obj2, InterfaceC1729Vy interfaceC1729Vy, int i) {
        super(1, interfaceC1729Vy);
        this.a = i;
        this.d = obj;
        this.e = obj2;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(InterfaceC1729Vy interfaceC1729Vy) {
        switch (this.a) {
            case 0:
                return new C1563Tu1((AppInfo) this.d, (C0781Jt1) this.e, interfaceC1729Vy, 0);
            default:
                return new C1563Tu1((C6860rY0) this.d, (String) this.e, interfaceC1729Vy, 1);
        }
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        InterfaceC1729Vy interfaceC1729Vy = (InterfaceC1729Vy) obj;
        switch (this.a) {
            case 0:
                return new C1563Tu1((AppInfo) this.d, (C0781Jt1) this.e, interfaceC1729Vy, 0).invokeSuspend(C1518Tf1.a);
            default:
                return new C1563Tu1((C6860rY0) this.d, (String) this.e, interfaceC1729Vy, 1).invokeSuspend(C1518Tf1.a);
        }
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) throws Throwable {
        AppInfo appInfo;
        Object objC;
        Object obj2;
        switch (this.a) {
            case 0:
                EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
                int i = this.b;
                C0781Jt1 c0781Jt1 = (C0781Jt1) this.e;
                if (i == 0) {
                    RQ1.d(obj);
                    C1320Qr1 c1320Qr1 = (C1320Qr1) c0781Jt1.h.getValue();
                    appInfo = (AppInfo) this.d;
                    this.c = appInfo;
                    this.b = 1;
                    obj = c1320Qr1.e(this);
                    if (obj == enumC1030Mz) {
                        return enumC1030Mz;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        RQ1.d(obj);
                        return C1518Tf1.a;
                    }
                    appInfo = (AppInfo) this.c;
                    RQ1.d(obj);
                }
                if (!O90.a(appInfo, obj)) {
                    C0070Aq1 c0070Aq1 = (C0070Aq1) c0781Jt1.n.getValue();
                    this.c = null;
                    this.b = 2;
                    if (c0070Aq1.f(this) == enumC1030Mz) {
                        return enumC1030Mz;
                    }
                }
                return C1518Tf1.a;
            default:
                EnumC1030Mz enumC1030Mz2 = EnumC1030Mz.a;
                int i2 = this.b;
                C6860rY0 c6860rY0 = (C6860rY0) this.d;
                if (i2 == 0) {
                    RQ1.d(obj);
                    C5996n11 c5996n11 = (C5996n11) c6860rY0.b;
                    this.b = 1;
                    objC = c5996n11.c((String) this.e, this);
                    if (objC == enumC1030Mz2) {
                        return enumC1030Mz2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.c;
                        RQ1.d(obj);
                        return new PS0(obj2);
                    }
                    RQ1.d(obj);
                    objC = ((PS0) obj).a;
                }
                Throwable thA = PS0.a(objC);
                if (thA != null && (thA instanceof HostIsNotMasterException)) {
                    Logger.DefaultImpls.warn$default((Logger) c6860rY0.e, "Register for pushes has failed, received HostIsNotMasterException", null, 2, null);
                    this.c = objC;
                    this.b = 2;
                    Object objA = ((C3669eu1) c6860rY0.d).a.a(this);
                    if (objA != enumC1030Mz2) {
                        objA = C1518Tf1.a;
                    }
                    if (objA == enumC1030Mz2) {
                        return enumC1030Mz2;
                    }
                }
                obj2 = objC;
                return new PS0(obj2);
        }
    }
}
