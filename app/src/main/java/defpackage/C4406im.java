package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: im */
/* loaded from: classes.dex */
public final /* synthetic */ class C4406im implements InterfaceC0443Fl, InterfaceC7612vU0 {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C4406im(long j, C1513Te c1513Te) {
        this.a = j;
        this.b = c1513Te;
    }

    @Override // defpackage.InterfaceC7612vU0
    /* renamed from: apply */
    public Object mo3apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.a));
        C1513Te c1513Te = (C1513Te) this.b;
        String str = c1513Te.a;
        EnumC7370uD0 enumC7370uD0 = c1513Te.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC8131yD0.a(enumC7370uD0))}) < 1) {
            contentValues.put("backend_name", c1513Te.a);
            contentValues.put("priority", Integer.valueOf(AbstractC8131yD0.a(enumC7370uD0)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(final C0365El c0365El) {
        C6329om c6329om = (C6329om) this.b;
        c6329om.getClass();
        final long j = this.a;
        c6329om.a(new InterfaceC6138nm() { // from class: jm
            @Override // defpackage.InterfaceC6138nm
            public final boolean c(TotalCaptureResult totalCaptureResult) {
                if (!C6329om.i(totalCaptureResult, j)) {
                    return false;
                }
                c0365El.b(null);
                return true;
            }
        });
        return "waitForSessionUpdateId:" + j;
    }

    public /* synthetic */ C4406im(C6329om c6329om, long j) {
        this.b = c6329om;
        this.a = j;
    }
}
