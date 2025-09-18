package p000;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class YY0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f14339a;

    /* renamed from: b */
    public final /* synthetic */ C8071Oo1 f14340b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f14341c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YY0(C8071Oo1 c8071Oo1, ArrayList arrayList, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f14340b = c8071Oo1;
        this.f14341c = arrayList;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new YY0(this.f14340b, this.f14341c, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((YY0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) throws RemoteException {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f14339a;
        if (i == 0) {
            RQ1.m7017d(obj);
            C0221DV c0221dv = C0221DV.f2022a;
            this.f14339a = 1;
            obj = c0221dv.m1707b(this);
            if (obj == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
        }
        Map map = (Map) obj;
        if (!map.isEmpty()) {
            Collection collectionValues = map.values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((C6220jA) it.next()).f34953a.m1590b()) {
                        ArrayList arrayList = this.f14341c;
                        C8071Oo1 c8071Oo1 = this.f14340b;
                        for (Message message : AbstractC7167xu.m25977W(AbstractC7167xu.m25997y(AbstractC7230yu.m26277h(C8071Oo1.m6145r(c8071Oo1, arrayList, 2), C8071Oo1.m6145r(c8071Oo1, arrayList, 1))), new C8774aq0(22))) {
                            Messenger messenger = (Messenger) c8071Oo1.f8628b;
                            LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) c8071Oo1.f8629c;
                            if (messenger != null) {
                                try {
                                    int i2 = message.what;
                                    messenger.send(message);
                                } catch (RemoteException unused) {
                                    int i3 = message.what;
                                    if (linkedBlockingDeque.offer(message)) {
                                        linkedBlockingDeque.size();
                                    }
                                }
                            } else if (linkedBlockingDeque.offer(message)) {
                                int i4 = message.what;
                                linkedBlockingDeque.size();
                            } else {
                                int i5 = message.what;
                            }
                        }
                    }
                }
            }
        }
        return C8313Tf1.f11463a;
    }
}
