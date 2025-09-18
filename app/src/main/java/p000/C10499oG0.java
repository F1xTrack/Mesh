package p000;

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
public final class C10499oG0 implements InterfaceC0643KC {

    /* renamed from: k */
    public static final String[] f38927k = {"_data"};

    /* renamed from: a */
    public final Context f38928a;

    /* renamed from: b */
    public final InterfaceC11215ts0 f38929b;

    /* renamed from: c */
    public final InterfaceC11215ts0 f38930c;

    /* renamed from: d */
    public final Uri f38931d;

    /* renamed from: e */
    public final int f38932e;

    /* renamed from: f */
    public final int f38933f;

    /* renamed from: g */
    public final C7830Jy0 f38934g;

    /* renamed from: h */
    public final Class f38935h;

    /* renamed from: i */
    public volatile boolean f38936i;

    /* renamed from: j */
    public volatile InterfaceC0643KC f38937j;

    public C10499oG0(Context context, InterfaceC11215ts0 interfaceC11215ts0, InterfaceC11215ts0 interfaceC11215ts02, Uri uri, int i, int i2, C7830Jy0 c7830Jy0, Class cls) {
        this.f38928a = context.getApplicationContext();
        this.f38929b = interfaceC11215ts0;
        this.f38930c = interfaceC11215ts02;
        this.f38931d = uri;
        this.f38932e = i;
        this.f38933f = i2;
        this.f38934g = c7830Jy0;
        this.f38935h = cls;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: a */
    public final Class mo3254a() {
        return this.f38935h;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: b */
    public final void mo3255b() {
        InterfaceC0643KC interfaceC0643KC = this.f38937j;
        if (interfaceC0643KC != null) {
            interfaceC0643KC.mo3255b();
        }
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: c */
    public final void mo3256c(EnumC11389vD0 enumC11389vD0, InterfaceC0580JC interfaceC0580JC) throws Throwable {
        try {
            InterfaceC0643KC interfaceC0643KCM23364e = m23364e();
            if (interfaceC0643KCM23364e == null) {
                interfaceC0580JC.mo556e(new IllegalArgumentException("Failed to build fetcher for: " + this.f38931d));
            } else {
                this.f38937j = interfaceC0643KCM23364e;
                if (this.f38936i) {
                    cancel();
                } else {
                    interfaceC0643KCM23364e.mo3256c(enumC11389vD0, interfaceC0580JC);
                }
            }
        } catch (FileNotFoundException e) {
            interfaceC0580JC.mo556e(e);
        }
    }

    @Override // p000.InterfaceC0643KC
    public final void cancel() {
        this.f38936i = true;
        InterfaceC0643KC interfaceC0643KC = this.f38937j;
        if (interfaceC0643KC != null) {
            interfaceC0643KC.cancel();
        }
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: d */
    public final EnumC1460XC mo3257d() {
        return EnumC1460XC.f13614a;
    }

    /* renamed from: e */
    public final InterfaceC0643KC m23364e() throws Throwable {
        C11087ss0 c11087ss0Mo8530b;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        C7830Jy0 c7830Jy0 = this.f38934g;
        int i = this.f38933f;
        int i2 = this.f38932e;
        Context context = this.f38928a;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f38931d;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f38927k, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            c11087ss0Mo8530b = this.f38929b.mo8530b(file, i2, i, c7830Jy0);
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
            Uri requireOriginal = this.f38931d;
            if (iCheckSelfPermission == 0) {
                requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
            }
            c11087ss0Mo8530b = this.f38930c.mo8530b(requireOriginal, i2, i, c7830Jy0);
        }
        if (c11087ss0Mo8530b != null) {
            return c11087ss0Mo8530b.f42649c;
        }
        return null;
    }
}
