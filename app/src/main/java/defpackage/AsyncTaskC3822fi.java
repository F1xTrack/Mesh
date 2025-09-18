package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.yalantis.ucrop.UCropActivity;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: fi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AsyncTaskC3822fi extends AsyncTask {
    public final Context a;
    public Uri b;
    public final Uri c;
    public final int d;
    public final int e;
    public final C5996n11 f;

    public AsyncTaskC3822fi(Context context, Uri uri, Uri uri2, int i, int i2, C5996n11 c5996n11) {
        this.a = context;
        this.b = uri;
        this.c = uri2;
        this.d = i;
        this.e = i2;
        this.f = c5996n11;
    }

    public final void a() throws Throwable {
        Closeable closeable;
        HS0 hs0;
        InputStream inputStreamOpenInputStream;
        FileOutputStream fileOutputStream;
        String scheme = this.b.getScheme();
        boolean zEquals = "http".equals(scheme);
        Uri uri = this.c;
        if (zEquals || "https".equals(scheme)) {
            Uri uri2 = this.b;
            Uri uri3 = this.c;
            if (uri == null) {
                throw new NullPointerException("Output Uri is null - cannot download image");
            }
            C6363ox0 c6363ox0 = new C6363ox0();
            C6860rY0 c6860rY0 = c6363ox0.a;
            InterfaceC0827Kj interfaceC0827Kj = null;
            try {
                C7375uF c7375uF = new C7375uF(9, false);
                c7375uF.G(uri2.toString());
                HS0 hs0Execute = FirebasePerfOkHttpClient.execute(c6363ox0.b(c7375uF.o()));
                try {
                    InterfaceC0827Kj interfaceC0827KjW = hs0Execute.g.w();
                    try {
                        OutputStream outputStreamOpenOutputStream = this.a.getContentResolver().openOutputStream(uri);
                        if (outputStreamOpenOutputStream == null) {
                            throw new NullPointerException("OutputStream for given output Uri is null");
                        }
                        C7166t9 c7166t9D = JI1.d(outputStreamOpenOutputStream);
                        interfaceC0827KjW.K(c7166t9D);
                        HO1.a(interfaceC0827KjW);
                        HO1.a(c7166t9D);
                        HO1.a(hs0Execute.g);
                        c6860rY0.s();
                        this.b = uri3;
                    } catch (Throwable th) {
                        th = th;
                        hs0 = hs0Execute;
                        closeable = null;
                        interfaceC0827Kj = interfaceC0827KjW;
                        HO1.a(interfaceC0827Kj);
                        HO1.a(closeable);
                        if (hs0 != null) {
                            HO1.a(hs0.g);
                        }
                        c6860rY0.s();
                        this.b = uri3;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    hs0 = hs0Execute;
                    closeable = null;
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
                hs0 = null;
            }
        } else {
            if (!RemoteMessageConst.Notification.CONTENT.equals(scheme)) {
                if (!"file".equals(scheme)) {
                    throw new IllegalArgumentException(AbstractC8235ym.v("Invalid Uri scheme", scheme));
                }
                return;
            }
            Uri uri4 = this.b;
            Uri uri5 = this.c;
            if (uri == null) {
                throw new NullPointerException("Output Uri is null - cannot copy image");
            }
            FileOutputStream fileOutputStream2 = null;
            try {
                inputStreamOpenInputStream = this.a.getContentResolver().openInputStream(uri4);
                try {
                    fileOutputStream = new FileOutputStream(new File(uri.getPath()));
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStreamOpenInputStream = null;
            }
            try {
                if (inputStreamOpenInputStream == null) {
                    throw new NullPointerException("InputStream for given input Uri is null");
                }
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStreamOpenInputStream.read(bArr);
                    if (i <= 0) {
                        HO1.a(fileOutputStream);
                        HO1.a(inputStreamOpenInputStream);
                        this.b = uri5;
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th6) {
                th = th6;
                fileOutputStream2 = fileOutputStream;
                HO1.a(fileOutputStream2);
                HO1.a(inputStreamOpenInputStream);
                this.b = uri5;
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r14) throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AsyncTaskC3822fi.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        C3631ei c3631ei = (C3631ei) obj;
        Exception exc = c3631ei.c;
        C5996n11 c5996n11 = this.f;
        if (exc != null) {
            InterfaceC6683qc1 interfaceC6683qc1 = ((AbstractC6873rc1) c5996n11.b).j;
            if (interfaceC6683qc1 != null) {
                UCropActivity uCropActivity = (UCropActivity) ((GQ0) interfaceC6683qc1).b;
                uCropActivity.l(exc);
                uCropActivity.finish();
                return;
            }
            return;
        }
        String path = this.b.getPath();
        Uri uri = this.c;
        String path2 = uri == null ? null : uri.getPath();
        AbstractC6873rc1 abstractC6873rc1 = (AbstractC6873rc1) c5996n11.b;
        abstractC6873rc1.p = path;
        abstractC6873rc1.q = path2;
        abstractC6873rc1.r = c3631ei.b;
        abstractC6873rc1.m = true;
        abstractC6873rc1.setImageBitmap(c3631ei.a);
    }
}
