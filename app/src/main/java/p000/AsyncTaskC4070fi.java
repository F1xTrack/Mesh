package p000;

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

/* renamed from: fi */
/* loaded from: classes2.dex */
public final class AsyncTaskC4070fi extends AsyncTask {

    /* renamed from: a */
    public final Context f27346a;

    /* renamed from: b */
    public Uri f27347b;

    /* renamed from: c */
    public final Uri f27348c;

    /* renamed from: d */
    public final int f27349d;

    /* renamed from: e */
    public final int f27350e;

    /* renamed from: f */
    public final C10339n11 f27351f;

    public AsyncTaskC4070fi(Context context, Uri uri, Uri uri2, int i, int i2, C10339n11 c10339n11) {
        this.f27346a = context;
        this.f27347b = uri;
        this.f27348c = uri2;
        this.f27349d = i;
        this.f27350e = i2;
        this.f27351f = c10339n11;
    }

    /* renamed from: a */
    public final void m18288a() throws Throwable {
        Closeable closeable;
        HS0 hs0;
        InputStream inputStreamOpenInputStream;
        FileOutputStream fileOutputStream;
        String scheme = this.f27347b.getScheme();
        boolean zEquals = "http".equals(scheme);
        Uri uri = this.f27348c;
        if (zEquals || "https".equals(scheme)) {
            Uri uri2 = this.f27347b;
            Uri uri3 = this.f27348c;
            if (uri == null) {
                throw new NullPointerException("Output Uri is null - cannot download image");
            }
            C10585ox0 c10585ox0 = new C10585ox0();
            C10919rY0 c10919rY0 = c10585ox0.f39371a;
            InterfaceC0676Kj interfaceC0676Kj = null;
            try {
                C6937uF c6937uF = new C6937uF(9, false);
                c6937uF.m25136G(uri2.toString());
                HS0 hs0Execute = FirebasePerfOkHttpClient.execute(c10585ox0.m23580b(c6937uF.m25141o()));
                try {
                    InterfaceC0676Kj interfaceC0676KjMo3385w = hs0Execute.f4301g.mo3385w();
                    try {
                        OutputStream outputStreamOpenOutputStream = this.f27346a.getContentResolver().openOutputStream(uri);
                        if (outputStreamOpenOutputStream == null) {
                            throw new NullPointerException("OutputStream for given output Uri is null");
                        }
                        C6868t9 c6868t9M4276d = JI1.m4276d(outputStreamOpenOutputStream);
                        interfaceC0676KjMo3385w.mo4703K(c6868t9M4276d);
                        HO1.m3403a(interfaceC0676KjMo3385w);
                        HO1.m3403a(c6868t9M4276d);
                        HO1.m3403a(hs0Execute.f4301g);
                        c10919rY0.m24420s();
                        this.f27347b = uri3;
                    } catch (Throwable th) {
                        th = th;
                        hs0 = hs0Execute;
                        closeable = null;
                        interfaceC0676Kj = interfaceC0676KjMo3385w;
                        HO1.m3403a(interfaceC0676Kj);
                        HO1.m3403a(closeable);
                        if (hs0 != null) {
                            HO1.m3403a(hs0.f4301g);
                        }
                        c10919rY0.m24420s();
                        this.f27347b = uri3;
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
                    throw new IllegalArgumentException(AbstractC7222ym.m26245v("Invalid Uri scheme", scheme));
                }
                return;
            }
            Uri uri4 = this.f27347b;
            Uri uri5 = this.f27348c;
            if (uri == null) {
                throw new NullPointerException("Output Uri is null - cannot copy image");
            }
            FileOutputStream fileOutputStream2 = null;
            try {
                inputStreamOpenInputStream = this.f27346a.getContentResolver().openInputStream(uri4);
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
                        HO1.m3403a(fileOutputStream);
                        HO1.m3403a(inputStreamOpenInputStream);
                        this.f27347b = uri5;
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th6) {
                th = th6;
                fileOutputStream2 = fileOutputStream;
                HO1.m3403a(fileOutputStream2);
                HO1.m3403a(inputStreamOpenInputStream);
                this.f27347b = uri5;
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
        throw new UnsupportedOperationException("Method not decompiled: p000.AsyncTaskC4070fi.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        C4007ei c4007ei = (C4007ei) obj;
        Exception exc = c4007ei.f26812c;
        C10339n11 c10339n11 = this.f27351f;
        if (exc != null) {
            InterfaceC10800qc1 interfaceC10800qc1 = ((AbstractC10928rc1) c10339n11.f38046b).f41763j;
            if (interfaceC10800qc1 != null) {
                UCropActivity uCropActivity = (UCropActivity) ((GQ0) interfaceC10800qc1).f3735b;
                uCropActivity.m13760l(exc);
                uCropActivity.finish();
                return;
            }
            return;
        }
        String path = this.f27347b.getPath();
        Uri uri = this.f27348c;
        String path2 = uri == null ? null : uri.getPath();
        AbstractC10928rc1 abstractC10928rc1 = (AbstractC10928rc1) c10339n11.f38046b;
        abstractC10928rc1.f41769p = path;
        abstractC10928rc1.f41770q = path2;
        abstractC10928rc1.f41771r = c4007ei.f26811b;
        abstractC10928rc1.f41766m = true;
        abstractC10928rc1.setImageBitmap(c4007ei.f26810a);
    }
}
