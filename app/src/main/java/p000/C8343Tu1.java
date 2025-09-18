package p000;

import com.p019vk.push.common.AppInfo;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.base.exception.HostIsNotMasterException;

/* renamed from: Tu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8343Tu1 extends AbstractC9714i71 implements InterfaceC6497nZ {

    /* renamed from: a */
    public final /* synthetic */ int f11591a;

    /* renamed from: b */
    public int f11592b;

    /* renamed from: c */
    public Object f11593c;

    /* renamed from: d */
    public final /* synthetic */ Object f11594d;

    /* renamed from: e */
    public final /* synthetic */ Object f11595e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8343Tu1(Object obj, Object obj2, InterfaceC1382Vy interfaceC1382Vy, int i) {
        super(1, interfaceC1382Vy);
        this.f11591a = i;
        this.f11594d = obj;
        this.f11595e = obj2;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(InterfaceC1382Vy interfaceC1382Vy) {
        switch (this.f11591a) {
            case 0:
                return new C8343Tu1((AppInfo) this.f11594d, (C7821Jt1) this.f11595e, interfaceC1382Vy, 0);
            default:
                return new C8343Tu1((C10919rY0) this.f11594d, (String) this.f11595e, interfaceC1382Vy, 1);
        }
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        InterfaceC1382Vy interfaceC1382Vy = (InterfaceC1382Vy) obj;
        switch (this.f11591a) {
            case 0:
                return new C8343Tu1((AppInfo) this.f11594d, (C7821Jt1) this.f11595e, interfaceC1382Vy, 0).invokeSuspend(C8313Tf1.f11463a);
            default:
                return new C8343Tu1((C10919rY0) this.f11594d, (String) this.f11595e, interfaceC1382Vy, 1).invokeSuspend(C8313Tf1.f11463a);
        }
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) throws Throwable {
        AppInfo appInfo;
        Object objM23042c;
        Object obj2;
        switch (this.f11591a) {
            case 0:
                EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
                int i = this.f11592b;
                C7821Jt1 c7821Jt1 = (C7821Jt1) this.f11595e;
                if (i == 0) {
                    RQ1.m7017d(obj);
                    C8181Qr1 c8181Qr1 = (C8181Qr1) c7821Jt1.f5783h.getValue();
                    appInfo = (AppInfo) this.f11594d;
                    this.f11593c = appInfo;
                    this.f11592b = 1;
                    obj = c8181Qr1.m6798e(this);
                    if (obj == enumC0817Mz) {
                        return enumC0817Mz;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        RQ1.m7017d(obj);
                        return C8313Tf1.f11463a;
                    }
                    appInfo = (AppInfo) this.f11593c;
                    RQ1.m7017d(obj);
                }
                if (!O90.m5963a(appInfo, obj)) {
                    C7347Aq1 c7347Aq1 = (C7347Aq1) c7821Jt1.f5789n.getValue();
                    this.f11593c = null;
                    this.f11592b = 2;
                    if (c7347Aq1.m353f(this) == enumC0817Mz) {
                        return enumC0817Mz;
                    }
                }
                return C8313Tf1.f11463a;
            default:
                EnumC0817Mz enumC0817Mz2 = EnumC0817Mz.f7418a;
                int i2 = this.f11592b;
                C10919rY0 c10919rY0 = (C10919rY0) this.f11594d;
                if (i2 == 0) {
                    RQ1.m7017d(obj);
                    C10339n11 c10339n11 = (C10339n11) c10919rY0.f41728b;
                    this.f11592b = 1;
                    objM23042c = c10339n11.m23042c((String) this.f11595e, this);
                    if (objM23042c == enumC0817Mz2) {
                        return enumC0817Mz2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f11593c;
                        RQ1.m7017d(obj);
                        return new PS0(obj2);
                    }
                    RQ1.m7017d(obj);
                    objM23042c = ((PS0) obj).f9075a;
                }
                Throwable thM6365a = PS0.m6365a(objM23042c);
                if (thM6365a != null && (thM6365a instanceof HostIsNotMasterException)) {
                    Logger.DefaultImpls.warn$default((Logger) c10919rY0.f41731e, "Register for pushes has failed, received HostIsNotMasterException", null, 2, null);
                    this.f11593c = objM23042c;
                    this.f11592b = 2;
                    Object objM6185a = ((C9300eu1) c10919rY0.f41730d).f26939a.m6185a(this);
                    if (objM6185a != enumC0817Mz2) {
                        objM6185a = C8313Tf1.f11463a;
                    }
                    if (objM6185a == enumC0817Mz2) {
                        return enumC0817Mz2;
                    }
                }
                obj2 = objM23042c;
                return new PS0(obj2);
        }
    }
}
