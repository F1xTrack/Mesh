package defpackage;

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
public final class A61 implements OR0, InterfaceC1103Nx0, InterfaceC6751qz0, PZ, RemoteCall, InterfaceC1651Uy {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ A61(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.OR0
    public Set F0() {
        Set setR = ((B61) this.b).r();
        HashSet hashSet = new HashSet(setR.size());
        Iterator it = setR.iterator();
        while (it.hasNext()) {
            JR0 jr0 = ((B61) it.next()).e;
            if (jr0 != null) {
                hashSet.add(jr0);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r5, defpackage.AbstractC1963Yy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C4057gw1
            if (r0 == 0) goto L13
            r0 = r6
            gw1 r0 = (defpackage.C4057gw1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gw1 r0 = new gw1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.RQ1.d(r6)
            PS0 r6 = (defpackage.PS0) r6
            java.lang.Object r5 = r6.a
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.RQ1.d(r6)
            r0.c = r3
            java.lang.Object r6 = r4.b
            Nv1 r6 = (defpackage.C1098Nv1) r6
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.A61.a(java.lang.String, Yy):java.lang.Object");
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) throws RemoteException {
        ((C8325zE1) obj).o((List) this.b, (S81) obj2);
    }

    public boolean b() {
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        if (!TextUtils.isEmpty(c3386dP1.b)) {
            return false;
        }
        OL1 ol1 = c3386dP1.i;
        C3386dP1.e(ol1);
        return ol1.D1(3);
    }

    @Override // defpackage.InterfaceC1103Nx0
    public void onComplete(Task task) {
        switch (this.a) {
            case 1:
                Exception excH = task.h();
                if (excH != null) {
                    ((C0767Jp) this.b).resumeWith(RQ1.b(excH));
                    break;
                } else if (!((C3892g32) task).d) {
                    ((C0767Jp) this.b).resumeWith(task.i());
                    break;
                } else {
                    ((C0767Jp) this.b).n(null);
                    break;
                }
            default:
                AbstractC3722fA1 abstractC3722fA1 = (AbstractC3722fA1) this.b;
                if (!task.k()) {
                    if (!((C3892g32) task).d) {
                        Exception excH2 = task.h();
                        if (!(excH2 instanceof ApiException)) {
                            abstractC3722fA1.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                            break;
                        } else {
                            abstractC3722fA1.setFailedResult(((ApiException) excH2).getStatus());
                            break;
                        }
                    } else {
                        abstractC3722fA1.setFailedResult(Status.RESULT_CANCELED);
                        break;
                    }
                } else {
                    abstractC3722fA1.setResult((AbstractC3722fA1) Status.RESULT_SUCCESS);
                    break;
                }
        }
    }

    @Override // defpackage.PZ
    public void onFailure(Throwable th) {
        AbstractC0759Jm0.f("VideoEncoderSession");
        ((C6557py0) this.b).l();
    }

    @Override // defpackage.PZ
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) {
        N8 n8 = (N8) this.b;
        if (task.k() || ((C3892g32) task).d) {
            return task;
        }
        Exception excH = task.h();
        if (!(excH instanceof ApiException)) {
            return task;
        }
        int statusCode = ((ApiException) excH).getStatusCode();
        if (statusCode != 43001 && statusCode != 43002 && statusCode != 43003 && statusCode != 17) {
            return statusCode == 43000 ? AbstractC3782fU1.d(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : statusCode != 15 ? task : AbstractC3782fU1.d(new Exception("The operation to get app set ID timed out. Please try again later."));
        }
        C6846rT1 c6846rT1 = (C6846rT1) n8.c;
        c6846rT1.getClass();
        S81 s81 = new S81();
        ((ExecutorService) c6846rT1.d).execute(new XZ(c6846rT1, 28, s81));
        return s81.a;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return super.toString() + "{fragment=" + ((B61) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public A61(C6845rT0 c6845rT0, C3866fw1 c3866fw1) {
        this.a = 6;
        this.b = c6845rT0;
    }

    public A61(C1098Nv1 c1098Nv1) {
        this.a = 7;
        O90.f(c1098Nv1, "vkpnsTopicRepository");
        this.b = c1098Nv1;
    }
}
