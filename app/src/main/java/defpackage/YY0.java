package defpackage;

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
public final class YY0 extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ C1155Oo1 b;
    public final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YY0(C1155Oo1 c1155Oo1, ArrayList arrayList, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = c1155Oo1;
        this.c = arrayList;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new YY0(this.b, this.c, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((YY0) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) throws RemoteException {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            DV dv = DV.a;
            this.a = 1;
            obj = dv.b(this);
            if (obj == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
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
                    if (((C5260jA) it.next()).a.b()) {
                        ArrayList arrayList = this.c;
                        C1155Oo1 c1155Oo1 = this.b;
                        for (Message message : AbstractC8069xu.W(AbstractC8069xu.y(AbstractC8259yu.h(C1155Oo1.r(c1155Oo1, arrayList, 2), C1155Oo1.r(c1155Oo1, arrayList, 1))), new C2209aq0(22))) {
                            Messenger messenger = (Messenger) c1155Oo1.b;
                            LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) c1155Oo1.c;
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
        return C1518Tf1.a;
    }
}
