package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: im */
/* loaded from: classes.dex */
public final /* synthetic */ class C4263im implements InterfaceC0363Fl, InterfaceC11423vU0 {

    /* renamed from: a */
    public final /* synthetic */ long f29442a;

    /* renamed from: b */
    public final /* synthetic */ Object f29443b;

    public /* synthetic */ C4263im(long j, C1236Te c1236Te) {
        this.f29442a = j;
        this.f29443b = c1236Te;
    }

    @Override // p000.InterfaceC11423vU0
    /* renamed from: apply */
    public Object mo26597apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f29442a));
        C1236Te c1236Te = (C1236Te) this.f29443b;
        String str = c1236Te.f11450a;
        EnumC11261uD0 enumC11261uD0 = c1236Te.f11452c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC11770yD0.m26100a(enumC11261uD0))}) < 1) {
            contentValues.put("backend_name", c1236Te.f11450a);
            contentValues.put("priority", Integer.valueOf(AbstractC11770yD0.m26100a(enumC11261uD0)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(final C0300El c0300El) {
        C6573om c6573om = (C6573om) this.f29443b;
        c6573om.getClass();
        final long j = this.f29442a;
        c6573om.m23543a(new InterfaceC6510nm() { // from class: jm
            @Override // p000.InterfaceC6510nm
            /* renamed from: c */
            public final boolean mo2326c(TotalCaptureResult totalCaptureResult) {
                if (!C6573om.m23542i(totalCaptureResult, j)) {
                    return false;
                }
                c0300El.m2375b(null);
                return true;
            }
        });
        return "waitForSessionUpdateId:" + j;
    }

    public /* synthetic */ C4263im(C6573om c6573om, long j) {
        this.f29443b = c6573om;
        this.f29442a = j;
    }
}
