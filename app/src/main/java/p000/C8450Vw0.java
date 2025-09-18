package p000;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import androidx.fragment.app.C1740v;
import com.google.android.gms.tasks.Task;
import com.p019vk.push.core.remote.config.omicron.C2424c;
import com.p019vk.push.core.remote.config.omicron.Data;
import com.p019vk.push.core.remote.config.omicron.DataId;
import com.p019vk.push.core.remote.config.omicron.Omicron;
import com.p019vk.push.core.remote.config.omicron.retriever.DataQuery;
import com.p019vk.push.core.remote.config.omicron.retriever.NetworkDataRetriever;
import com.p019vk.push.core.remote.config.omicron.scheduler.ScheduledExecutor;
import com.p019vk.push.core.remote.config.omicron.segment.SegmentsProvider;
import com.p019vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
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
public final /* synthetic */ class C8450Vw0 implements InterfaceC8346Tw0, SegmentsProvider, ScheduledExecutor.ScheduledTask, InterfaceC6471n9, QA0, InterfaceC1154SL, InterfaceC0560It, InterfaceC0342FQ, InterfaceC6227jH, InterfaceC0363Fl, InterfaceC11423vU0, InterfaceC8571Ye1, InterfaceC9253eX0, InterfaceC1319Uy, InterfaceC0682Kp, InterfaceC6587oy, InterfaceC7431Cg1, InterfaceC11886z71, InterfaceC8036Nx0 {

    /* renamed from: a */
    public final /* synthetic */ int f12874a;

    /* renamed from: b */
    public final /* synthetic */ Object f12875b;

    public /* synthetic */ C8450Vw0(int i, Object obj) {
        this.f12874a = i;
        this.f12875b = obj;
    }

    @Override // p000.InterfaceC7431Cg1
    /* renamed from: a */
    public Object mo1269a() {
        Class cls = (Class) this.f12875b;
        O90.m5968f(cls, "$clazz");
        throw new IllegalArgumentException(AbstractC11153tN0.m24910v(cls, "Cannot allocate "));
    }

    @Override // p000.InterfaceC6471n9
    public InterfaceFutureC7800Jj0 apply(Object obj) {
        return ((C9597hD0) this.f12875b).f28320d.mo6593k();
    }

    @Override // p000.InterfaceC6587oy
    /* renamed from: b */
    public void mo4000b(Object obj) {
        C7122xB c7122xB = (C7122xB) obj;
        switch (this.f12874a) {
            case 18:
                Z51 z51 = (Z51) this.f12875b;
                z51.getClass();
                Y51 y51 = new Y51(c7122xB.f45433b, C7564Ev0.m2447e(c7122xB.f45432a, c7122xB.f45434c));
                z51.f14712c.add(y51);
                long j = z51.f14719j;
                if (j == -9223372036854775807L || c7122xB.f45433b >= j) {
                    z51.m9474a(y51);
                    break;
                }
                break;
            default:
                ((M70) this.f12875b).m3755a(c7122xB);
                break;
        }
    }

    @Override // p000.InterfaceC8346Tw0
    /* renamed from: c */
    public Object mo2071c() {
        return ((Constructor) this.f12875b).newInstance(null);
    }

    @Override // p000.InterfaceC1154SL
    /* renamed from: d */
    public InterfaceC1091RL mo7363d(C10825qp0 c10825qp0) {
        return (InterfaceC1091RL) this.f12875b;
    }

    @Override // p000.InterfaceC0682Kp
    /* renamed from: e */
    public void mo3136e() {
        C1740v c1740v = (C1740v) this.f12875b;
        O90.m5968f(c1740v, "this$0");
        c1740v.m10118a();
    }

    @Override // p000.InterfaceC11886z71
    public Object execute() {
        SQLiteDatabase sQLiteDatabaseM25901m;
        Object obj = this.f12875b;
        switch (this.f12874a) {
            case 24:
                C11677xU0 c11677xU0 = (C11677xU0) ((InterfaceC1750at) obj);
                c11677xU0.getClass();
                int i = C3955dt.f26348e;
                C10919rY0 c10919rY0 = new C10919rY0(6, false);
                c10919rY0.f41729c = null;
                c10919rY0.f41730d = new ArrayList();
                c10919rY0.f41731e = null;
                c10919rY0.f41728b = "";
                HashMap map = new HashMap();
                sQLiteDatabaseM25901m = c11677xU0.m25901m();
                sQLiteDatabaseM25901m.beginTransaction();
                try {
                    C3955dt c3955dt = (C3955dt) C11677xU0.m25899D(sQLiteDatabaseM25901m.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C4224i9(c11677xU0, map, c10919rY0, 19));
                    sQLiteDatabaseM25901m.setTransactionSuccessful();
                    return c3955dt;
                } finally {
                }
            case 25:
                C11677xU0 c11677xU02 = (C11677xU0) ((InterfaceC0970PP) obj);
                long jMo2451d = c11677xU02.f45656b.mo2451d() - c11677xU02.f45658d.f2087d;
                sQLiteDatabaseM25901m = c11677xU02.m25901m();
                sQLiteDatabaseM25901m.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jMo2451d)};
                    C11677xU0.m25899D(sQLiteDatabaseM25901m.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C8450Vw0(12, c11677xU02));
                    int iDelete = sQLiteDatabaseM25901m.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseM25901m.setTransactionSuccessful();
                    sQLiteDatabaseM25901m.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
            default:
                C11677xU0 c11677xU03 = (C11677xU0) ((C8575Yg1) obj).f14451i;
                sQLiteDatabaseM25901m = c11677xU03.m25901m();
                sQLiteDatabaseM25901m.beginTransaction();
                try {
                    sQLiteDatabaseM25901m.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseM25901m.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c11677xU03.f45656b.mo2451d()).execute();
                    sQLiteDatabaseM25901m.setTransactionSuccessful();
                    return null;
                } finally {
                }
        }
    }

    @Override // p000.InterfaceC9253eX0
    /* renamed from: f */
    public boolean mo501f() {
        XW0.m9061l((XW0) this.f12875b);
        return false;
    }

    @Override // com.p019vk.push.core.remote.config.omicron.segment.SegmentsProvider
    public Map getSegments() {
        Data data = ((Omicron) this.f12875b).f20503a.f47111b;
        if (data != null) {
            return data.getSegments();
        }
        throw new IllegalStateException("init() must be called before any access to logic");
    }

    @Override // p000.InterfaceC6227jH
    /* renamed from: h */
    public void mo410h(InterfaceC9347fG0 interfaceC9347fG0) {
        C10919rY0 c10919rY0 = ((C11159tQ0) ((InterfaceC6953uV) interfaceC9347fG0.get())).m24930b("firebase").f40125l;
        Set set = (Set) c10919rY0.f41731e;
        C6869tA c6869tA = (C6869tA) this.f12875b;
        set.add(c6869tA);
        Task taskM26005c = ((C7169xw) c10919rY0.f41728b).m26005c();
        taskM26005c.mo11138e((Executor) c10919rY0.f41730d, new C4224i9(c10919rY0, taskM26005c, c6869tA, 16));
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(C0300El c0300El) {
        switch (this.f12874a) {
            case 10:
                C6447mm c6447mm = (C6447mm) this.f12875b;
                c6447mm.f37865c = c0300El;
                return "RequestCompleteListener[" + c6447mm + "]";
            case 20:
                Q61 q61 = (Q61) this.f12875b;
                q61.f9481p = c0300El;
                return "SettableFuture hashCode: " + q61.hashCode();
            case 21:
                ((T61) this.f12875b).f11166k = c0300El;
                return "SurfaceOutputImpl close future complete";
            default:
                ((Q91) this.f12875b).f9510k.set(c0300El);
                return "textureViewImpl_waitForNextFrame";
        }
    }

    @Override // p000.InterfaceC8571Ye1
    /* renamed from: i */
    public void mo502i(C11856yu0 c11856yu0) {
        HW0 hw0 = (HW0) this.f12875b;
        O90.m5968f(hw0, "this$0");
        O90.m5968f(c11856yu0, "nativeViewHierarchyManager");
        View viewResolveView = c11856yu0.resolveView(hw0.f2649a);
        if (viewResolveView instanceof SV0) {
            ((SV0) viewResolveView).m7381g();
        }
    }

    @Override // p000.InterfaceC0560It
    /* renamed from: j */
    public C22 mo503j(C10825qp0 c10825qp0) {
        return ((InterfaceC0560It) this.f12875b).mo503j(c10825qp0);
    }

    @Override // p000.InterfaceC0342FQ
    /* renamed from: k */
    public InterfaceC0468HQ mo2631k(UUID uuid) {
        return (C1356VY) this.f12875b;
    }

    @Override // p000.InterfaceC8036Nx0
    public void onComplete(Task task) {
        switch (this.f12874a) {
            case 27:
                AbstractC10948rm1.m24486b((Intent) this.f12875b);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((C11336uo1) this.f12875b).f43928b.m7186d(null);
                break;
            default:
                ((ScheduledFuture) this.f12875b).cancel(false);
                break;
        }
    }

    @Override // p000.QA0
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        PermissionRequest permissionRequest;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        GeolocationPermissions.Callback callback;
        String str;
        AbstractC9221eH0 abstractC9221eH0 = (AbstractC9221eH0) this.f12875b;
        abstractC9221eH0.f26643h = false;
        boolean z = false;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str2 = strArr[i2];
            boolean z2 = iArr[i2] == 0;
            if (str2.equals("android.permission.ACCESS_FINE_LOCATION") && (callback = abstractC9221eH0.f26641f) != null && (str = abstractC9221eH0.f26642g) != null) {
                if (z2) {
                    callback.invoke(str, true, false);
                } else {
                    callback.invoke(str, false, false);
                }
                abstractC9221eH0.f26641f = null;
                abstractC9221eH0.f26642g = null;
            }
            if (str2.equals("android.permission.RECORD_AUDIO")) {
                if (z2 && (arrayList4 = abstractC9221eH0.f26640e) != null) {
                    arrayList4.add("android.webkit.resource.AUDIO_CAPTURE");
                }
                z = true;
            }
            if (str2.equals("android.permission.CAMERA")) {
                if (z2 && (arrayList3 = abstractC9221eH0.f26640e) != null) {
                    arrayList3.add("android.webkit.resource.VIDEO_CAPTURE");
                }
                z = true;
            }
            if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (z2 && (arrayList2 = abstractC9221eH0.f26640e) != null) {
                    arrayList2.add("android.webkit.resource.PROTECTED_MEDIA_ID");
                }
                z = true;
            }
        }
        if (z && (permissionRequest = abstractC9221eH0.f26639d) != null && (arrayList = abstractC9221eH0.f26640e) != null) {
            permissionRequest.grant((String[]) arrayList.toArray(new String[0]));
            abstractC9221eH0.f26639d = null;
            abstractC9221eH0.f26640e = null;
        }
        ArrayList arrayList5 = abstractC9221eH0.f26644i;
        if (arrayList5.isEmpty()) {
            return true;
        }
        abstractC9221eH0.m17895a(arrayList5);
        return false;
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) {
        boolean z;
        ((C1002Pv) this.f12875b).getClass();
        if (task.mo11144k()) {
            C0669Kc c0669Kc = (C0669Kc) task.mo11142i();
            String str = c0669Kc.f6224b;
            File file = c0669Kc.f6225c;
            if (file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
            z = true;
        } else {
            task.mo11141h();
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // p000.InterfaceC11423vU0
    /* renamed from: apply */
    public Object mo26597apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        C11677xU0 c11677xU0 = (C11677xU0) this.f12875b;
        c11677xU0.getClass();
        while (cursor.moveToNext()) {
            c11677xU0.m25904w(cursor.getInt(0), EnumC9921jl0.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    @Override // com.vk.push.core.remote.config.omicron.scheduler.ScheduledExecutor.ScheduledTask, p000.InterfaceC11886z71
    public ScheduledExecutor.TaskResult execute() {
        C2424c c2424c = (C2424c) this.f12875b;
        C7360Ax0 c7360Ax0 = c2424c.f20541g;
        SerializationDataStorage serializationDataStorage = c7360Ax0.f484a;
        DataId dataId = c2424c.f47113d;
        Data data = serializationDataStorage.getData(dataId);
        DataQuery dataQueryM26590a = data == null ? c2424c.m26590a() : c2424c.m26591b(data);
        NetworkDataRetriever networkDataRetriever = c7360Ax0.f485b;
        int i = AbstractC11862yx0.f46550b[networkDataRetriever.retrieve(dataId, dataQueryM26590a).ordinal()];
        if (i == 1) {
            serializationDataStorage.putData(dataId, networkDataRetriever.getData());
            c2424c.f47110a.set(networkDataRetriever.getData());
            c2424c.f47112c.f20510f.onCacheUpdated(dataId);
        } else if (i != 2) {
            return ScheduledExecutor.TaskResult.FAIL;
        }
        c7360Ax0.f486c.setUpdateDate(dataId, c7360Ax0.f487d.getCurrentDate());
        return ScheduledExecutor.TaskResult.SUCCESS;
    }
}
