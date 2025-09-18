package defpackage;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import androidx.fragment.app.v;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.DataId;
import com.vk.push.core.remote.config.omicron.Omicron;
import com.vk.push.core.remote.config.omicron.c;
import com.vk.push.core.remote.config.omicron.retriever.DataQuery;
import com.vk.push.core.remote.config.omicron.retriever.NetworkDataRetriever;
import com.vk.push.core.remote.config.omicron.scheduler.ScheduledExecutor;
import com.vk.push.core.remote.config.omicron.segment.SegmentsProvider;
import com.vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;

/* renamed from: Vw0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1724Vw0 implements InterfaceC1568Tw0, SegmentsProvider, ScheduledExecutor.ScheduledTask, InterfaceC6021n9, QA0, SL, InterfaceC0701It, FQ, InterfaceC5281jH, InterfaceC0443Fl, InterfaceC7612vU0, InterfaceC1905Ye1, InterfaceC3599eX0, InterfaceC1651Uy, InterfaceC0845Kp, InterfaceC6365oy, InterfaceC0196Cg1, InterfaceC8304z71, InterfaceC1103Nx0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1724Vw0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC0196Cg1
    public Object a() {
        Class cls = (Class) this.b;
        O90.f(cls, "$clazz");
        throw new IllegalArgumentException(AbstractC7209tN0.v(cls, "Cannot allocate "));
    }

    @Override // defpackage.InterfaceC6021n9
    public InterfaceFutureC0750Jj0 apply(Object obj) {
        return ((C4112hD0) this.b).d.k();
    }

    @Override // defpackage.InterfaceC6365oy
    public void b(Object obj) {
        C7934xB c7934xB = (C7934xB) obj;
        switch (this.a) {
            case 18:
                Z51 z51 = (Z51) this.b;
                z51.getClass();
                Y51 y51 = new Y51(c7934xB.b, C0396Ev0.e(c7934xB.a, c7934xB.c));
                z51.c.add(y51);
                long j = z51.j;
                if (j == -9223372036854775807L || c7934xB.b >= j) {
                    z51.a(y51);
                    break;
                }
                break;
            default:
                ((M70) this.b).a(c7934xB);
                break;
        }
    }

    @Override // defpackage.InterfaceC1568Tw0
    public Object c() {
        return ((Constructor) this.b).newInstance(null);
    }

    @Override // defpackage.SL
    public RL d(C6721qp0 c6721qp0) {
        return (RL) this.b;
    }

    @Override // defpackage.InterfaceC0845Kp
    public void e() {
        v vVar = (v) this.b;
        O90.f(vVar, "this$0");
        vVar.a();
    }

    @Override // defpackage.InterfaceC8304z71
    public Object execute() {
        SQLiteDatabase sQLiteDatabaseM;
        Object obj = this.b;
        switch (this.a) {
            case 24:
                C7992xU0 c7992xU0 = (C7992xU0) ((InterfaceC2217at) obj);
                c7992xU0.getClass();
                int i = C3473dt.e;
                C6860rY0 c6860rY0 = new C6860rY0(6, false);
                c6860rY0.c = null;
                c6860rY0.d = new ArrayList();
                c6860rY0.e = null;
                c6860rY0.b = "";
                HashMap map = new HashMap();
                sQLiteDatabaseM = c7992xU0.m();
                sQLiteDatabaseM.beginTransaction();
                try {
                    C3473dt c3473dt = (C3473dt) C7992xU0.D(sQLiteDatabaseM.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C4290i9(c7992xU0, map, c6860rY0, 19));
                    sQLiteDatabaseM.setTransactionSuccessful();
                    return c3473dt;
                } finally {
                }
            case 25:
                C7992xU0 c7992xU02 = (C7992xU0) ((PP) obj);
                long jD = c7992xU02.b.d() - c7992xU02.d.d;
                sQLiteDatabaseM = c7992xU02.m();
                sQLiteDatabaseM.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jD)};
                    C7992xU0.D(sQLiteDatabaseM.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C1724Vw0(12, c7992xU02));
                    int iDelete = sQLiteDatabaseM.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseM.setTransactionSuccessful();
                    sQLiteDatabaseM.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
            default:
                C7992xU0 c7992xU03 = (C7992xU0) ((C1911Yg1) obj).i;
                sQLiteDatabaseM = c7992xU03.m();
                sQLiteDatabaseM.beginTransaction();
                try {
                    sQLiteDatabaseM.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseM.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c7992xU03.b.d()).execute();
                    sQLiteDatabaseM.setTransactionSuccessful();
                    return null;
                } finally {
                }
        }
    }

    @Override // defpackage.InterfaceC3599eX0
    public boolean f() {
        XW0.l((XW0) this.b);
        return false;
    }

    @Override // com.vk.push.core.remote.config.omicron.segment.SegmentsProvider
    public Map getSegments() {
        Data data = ((Omicron) this.b).a.b;
        if (data != null) {
            return data.getSegments();
        }
        throw new IllegalStateException("init() must be called before any access to logic");
    }

    @Override // defpackage.InterfaceC5281jH
    public void h(InterfaceC3739fG0 interfaceC3739fG0) {
        C6860rY0 c6860rY0 = ((C7218tQ0) ((InterfaceC7423uV) interfaceC3739fG0.get())).b("firebase").l;
        Set set = (Set) c6860rY0.e;
        C7169tA c7169tA = (C7169tA) this.b;
        set.add(c7169tA);
        Task taskC = ((C8075xw) c6860rY0.b).c();
        taskC.e((Executor) c6860rY0.d, new C4290i9(c6860rY0, taskC, c7169tA, 16));
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        switch (this.a) {
            case 10:
                C5947mm c5947mm = (C5947mm) this.b;
                c5947mm.c = c0365El;
                return "RequestCompleteListener[" + c5947mm + "]";
            case 20:
                Q61 q61 = (Q61) this.b;
                q61.p = c0365El;
                return "SettableFuture hashCode: " + q61.hashCode();
            case 21:
                ((T61) this.b).k = c0365El;
                return "SurfaceOutputImpl close future complete";
            default:
                ((Q91) this.b).k.set(c0365El);
                return "textureViewImpl_waitForNextFrame";
        }
    }

    @Override // defpackage.InterfaceC1905Ye1
    public void i(C8260yu0 c8260yu0) {
        HW0 hw0 = (HW0) this.b;
        O90.f(hw0, "this$0");
        O90.f(c8260yu0, "nativeViewHierarchyManager");
        View viewResolveView = c8260yu0.resolveView(hw0.a);
        if (viewResolveView instanceof SV0) {
            ((SV0) viewResolveView).g();
        }
    }

    @Override // defpackage.InterfaceC0701It
    public C22 j(C6721qp0 c6721qp0) {
        return ((InterfaceC0701It) this.b).j(c6721qp0);
    }

    @Override // defpackage.FQ
    public HQ k(UUID uuid) {
        return (VY) this.b;
    }

    @Override // defpackage.InterfaceC1103Nx0
    public void onComplete(Task task) {
        switch (this.a) {
            case 27:
                AbstractC6903rm1.b((Intent) this.b);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((C7482uo1) this.b).b.d(null);
                break;
            default:
                ((ScheduledFuture) this.b).cancel(false);
                break;
        }
    }

    @Override // defpackage.QA0
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        PermissionRequest permissionRequest;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        GeolocationPermissions.Callback callback;
        String str;
        AbstractC3551eH0 abstractC3551eH0 = (AbstractC3551eH0) this.b;
        abstractC3551eH0.h = false;
        boolean z = false;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str2 = strArr[i2];
            boolean z2 = iArr[i2] == 0;
            if (str2.equals("android.permission.ACCESS_FINE_LOCATION") && (callback = abstractC3551eH0.f) != null && (str = abstractC3551eH0.g) != null) {
                if (z2) {
                    callback.invoke(str, true, false);
                } else {
                    callback.invoke(str, false, false);
                }
                abstractC3551eH0.f = null;
                abstractC3551eH0.g = null;
            }
            if (str2.equals("android.permission.RECORD_AUDIO")) {
                if (z2 && (arrayList4 = abstractC3551eH0.e) != null) {
                    arrayList4.add("android.webkit.resource.AUDIO_CAPTURE");
                }
                z = true;
            }
            if (str2.equals("android.permission.CAMERA")) {
                if (z2 && (arrayList3 = abstractC3551eH0.e) != null) {
                    arrayList3.add("android.webkit.resource.VIDEO_CAPTURE");
                }
                z = true;
            }
            if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (z2 && (arrayList2 = abstractC3551eH0.e) != null) {
                    arrayList2.add("android.webkit.resource.PROTECTED_MEDIA_ID");
                }
                z = true;
            }
        }
        if (z && (permissionRequest = abstractC3551eH0.d) != null && (arrayList = abstractC3551eH0.e) != null) {
            permissionRequest.grant((String[]) arrayList.toArray(new String[0]));
            abstractC3551eH0.d = null;
            abstractC3551eH0.e = null;
        }
        ArrayList arrayList5 = abstractC3551eH0.i;
        if (arrayList5.isEmpty()) {
            return true;
        }
        abstractC3551eH0.a(arrayList5);
        return false;
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) {
        boolean z;
        ((C1252Pv) this.b).getClass();
        if (task.k()) {
            C0806Kc c0806Kc = (C0806Kc) task.i();
            String str = c0806Kc.b;
            File file = c0806Kc.c;
            if (file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
            z = true;
        } else {
            task.h();
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.InterfaceC7612vU0
    /* renamed from: apply */
    public Object mo3apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        C7992xU0 c7992xU0 = (C7992xU0) this.b;
        c7992xU0.getClass();
        while (cursor.moveToNext()) {
            c7992xU0.w(cursor.getInt(0), EnumC5372jl0.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    @Override // com.vk.push.core.remote.config.omicron.scheduler.ScheduledExecutor.ScheduledTask, defpackage.InterfaceC8304z71
    public ScheduledExecutor.TaskResult execute() {
        c cVar = (c) this.b;
        C0090Ax0 c0090Ax0 = cVar.g;
        SerializationDataStorage serializationDataStorage = c0090Ax0.a;
        DataId dataId = cVar.d;
        Data data = serializationDataStorage.getData(dataId);
        DataQuery dataQueryA = data == null ? cVar.a() : cVar.b(data);
        NetworkDataRetriever networkDataRetriever = c0090Ax0.b;
        int i = AbstractC8269yx0.b[networkDataRetriever.retrieve(dataId, dataQueryA).ordinal()];
        if (i == 1) {
            serializationDataStorage.putData(dataId, networkDataRetriever.getData());
            cVar.a.set(networkDataRetriever.getData());
            cVar.c.f.onCacheUpdated(dataId);
        } else if (i != 2) {
            return ScheduledExecutor.TaskResult.FAIL;
        }
        c0090Ax0.c.setUpdateDate(dataId, c0090Ax0.d.getCurrentDate());
        return ScheduledExecutor.TaskResult.SUCCESS;
    }
}
