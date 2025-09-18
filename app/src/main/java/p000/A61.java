package p000;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class A61 implements OR0, InterfaceC8036Nx0, InterfaceC10845qz0, InterfaceC0980PZ, RemoteCall, InterfaceC1319Uy {

    /* renamed from: a */
    public final /* synthetic */ int f72a;

    /* renamed from: b */
    public final Object f73b;

    public /* synthetic */ A61(int i, Object obj) {
        this.f72a = i;
        this.f73b = obj;
    }

    @Override // p000.OR0
    /* renamed from: F0 */
    public Set mo53F0() {
        Set setM497r = ((B61) this.f73b).m497r();
        HashSet hashSet = new HashSet(setM497r.size());
        Iterator it = setM497r.iterator();
        while (it.hasNext()) {
            JR0 jr0 = ((B61) it.next()).f576e;
            if (jr0 != null) {
                hashSet.add(jr0);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m54a(java.lang.String r5, p000.AbstractC1571Yy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p000.C9560gw1
            if (r0 == 0) goto L13
            r0 = r6
            gw1 r0 = (p000.C9560gw1) r0
            int r1 = r0.f28110c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28110c = r1
            goto L18
        L13:
            gw1 r0 = new gw1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f28108a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f28110c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p000.RQ1.m7017d(r6)
            PS0 r6 = (p000.PS0) r6
            java.lang.Object r5 = r6.f9075a
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p000.RQ1.m7017d(r6)
            r0.f28110c = r3
            java.lang.Object r6 = r4.f73b
            Nv1 r6 = (p000.C8033Nv1) r6
            java.lang.Object r5 = r6.m5905a(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.A61.m54a(java.lang.String, Yy):java.lang.Object");
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) throws RemoteException {
        ((C11900zE1) obj).m26348o((List) this.f73b, (S81) obj2);
    }

    /* renamed from: b */
    public boolean m55b() {
        C9110dP1 c9110dP1 = (C9110dP1) this.f73b;
        if (!TextUtils.isEmpty(c9110dP1.f26032b)) {
            return false;
        }
        OL1 ol1 = c9110dP1.f26039i;
        C9110dP1.m17592e(ol1);
        return ol1.m6029D1(3);
    }

    @Override // p000.InterfaceC8036Nx0
    public void onComplete(Task task) {
        switch (this.f72a) {
            case 1:
                Exception excMo11141h = task.mo11141h();
                if (excMo11141h != null) {
                    ((C0619Jp) this.f73b).resumeWith(RQ1.m7015b(excMo11141h));
                    break;
                } else if (!((C9450g32) task).f27546d) {
                    ((C0619Jp) this.f73b).resumeWith(task.mo11142i());
                    break;
                } else {
                    ((C0619Jp) this.f73b).m4434n(null);
                    break;
                }
            default:
                AbstractC9336fA1 abstractC9336fA1 = (AbstractC9336fA1) this.f73b;
                if (!task.mo11144k()) {
                    if (!((C9450g32) task).f27546d) {
                        Exception excMo11141h2 = task.mo11141h();
                        if (!(excMo11141h2 instanceof ApiException)) {
                            abstractC9336fA1.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                            break;
                        } else {
                            abstractC9336fA1.setFailedResult(((ApiException) excMo11141h2).getStatus());
                            break;
                        }
                    } else {
                        abstractC9336fA1.setFailedResult(Status.RESULT_CANCELED);
                        break;
                    }
                } else {
                    abstractC9336fA1.setResult((AbstractC9336fA1) Status.RESULT_SUCCESS);
                    break;
                }
        }
    }

    @Override // p000.InterfaceC0980PZ
    public void onFailure(Throwable th) {
        AbstractC7806Jm0.m4412f("VideoEncoderSession");
        ((C10715py0) this.f73b).m23916l();
    }

    @Override // p000.InterfaceC0980PZ
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) {
        C0827N8 c0827n8 = (C0827N8) this.f73b;
        if (task.mo11144k() || ((C9450g32) task).f27546d) {
            return task;
        }
        Exception excMo11141h = task.mo11141h();
        if (!(excMo11141h instanceof ApiException)) {
            return task;
        }
        int statusCode = ((ApiException) excMo11141h).getStatusCode();
        if (statusCode != 43001 && statusCode != 43002 && statusCode != 43003 && statusCode != 17) {
            return statusCode == 43000 ? AbstractC9376fU1.m18243d(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : statusCode != 15 ? task : AbstractC9376fU1.m18243d(new Exception("The operation to get app set ID timed out. Please try again later."));
        }
        C10910rT1 c10910rT1 = (C10910rT1) c0827n8.f7524c;
        c10910rT1.getClass();
        S81 s81 = new S81();
        ((ExecutorService) c10910rT1.f41680d).execute(new RunnableC1483XZ(c10910rT1, 28, s81));
        return s81.f10598a;
    }

    public String toString() {
        switch (this.f72a) {
            case 0:
                return super.toString() + "{fragment=" + ((B61) this.f73b) + "}";
            default:
                return super.toString();
        }
    }

    public A61(C10909rT0 c10909rT0, C9432fw1 c9432fw1) {
        this.f72a = 6;
        this.f73b = c10909rT0;
    }

    public A61(C8033Nv1 c8033Nv1) {
        this.f72a = 7;
        O90.m5968f(c8033Nv1, "vkpnsTopicRepository");
        this.f73b = c8033Nv1;
    }
}
