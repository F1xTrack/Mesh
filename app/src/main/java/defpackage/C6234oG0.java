package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: oG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6234oG0 implements KC {
    public static final String[] k = {"_data"};
    public final Context a;
    public final InterfaceC7302ts0 b;
    public final InterfaceC7302ts0 c;
    public final Uri d;
    public final int e;
    public final int f;
    public final C0795Jy0 g;
    public final Class h;
    public volatile boolean i;
    public volatile KC j;

    public C6234oG0(Context context, InterfaceC7302ts0 interfaceC7302ts0, InterfaceC7302ts0 interfaceC7302ts02, Uri uri, int i, int i2, C0795Jy0 c0795Jy0, Class cls) {
        this.a = context.getApplicationContext();
        this.b = interfaceC7302ts0;
        this.c = interfaceC7302ts02;
        this.d = uri;
        this.e = i;
        this.f = i2;
        this.g = c0795Jy0;
        this.h = cls;
    }

    @Override // defpackage.KC
    public final Class a() {
        return this.h;
    }

    @Override // defpackage.KC
    public final void b() {
        KC kc = this.j;
        if (kc != null) {
            kc.b();
        }
    }

    @Override // defpackage.KC
    public final void c(EnumC7561vD0 enumC7561vD0, JC jc) throws Throwable {
        try {
            KC kcE = e();
            if (kcE == null) {
                jc.e(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
            } else {
                this.j = kcE;
                if (this.i) {
                    cancel();
                } else {
                    kcE.c(enumC7561vD0, jc);
                }
            }
        } catch (FileNotFoundException e) {
            jc.e(e);
        }
    }

    @Override // defpackage.KC
    public final void cancel() {
        this.i = true;
        KC kc = this.j;
        if (kc != null) {
            kc.cancel();
        }
    }

    @Override // defpackage.KC
    public final XC d() {
        return XC.a;
    }

    public final KC e() throws Throwable {
        C7111ss0 c7111ss0B;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        C0795Jy0 c0795Jy0 = this.g;
        int i = this.f;
        int i2 = this.e;
        Context context = this.a;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.d;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, k, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            c7111ss0B = this.b.b(file, i2, i, c0795Jy0);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            int iCheckSelfPermission = context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
            Uri requireOriginal = this.d;
            if (iCheckSelfPermission == 0) {
                requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
            }
            c7111ss0B = this.c.b(requireOriginal, i2, i, c0795Jy0);
        }
        if (c7111ss0B != null) {
            return c7111ss0B.c;
        }
        return null;
    }
}
