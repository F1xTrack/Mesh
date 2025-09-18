package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: Ps1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AsyncTaskC1245Ps1 extends AsyncTask {
    public static volatile boolean a = false;

    public static void a() {
        Context context;
        if (a || (context = AbstractC3401dU1.a) == null) {
            return;
        }
        a = true;
        long j = AbstractC8451zu1.a(context).getLong("lastCheckTime", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - j > 432000000) {
            AbstractC8451zu1.a(context).edit().putLong("lastCheckTime", jCurrentTimeMillis).apply();
            new AsyncTaskC1245Ps1().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, AbstractC3401dU1.a);
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) throws IOException {
        FileInputStream fileInputStreamH;
        Context[] contextArr = (Context[]) objArr;
        System.currentTimeMillis();
        try {
            fileInputStreamH = AbstractC6889ri.h(contextArr[0]);
        } catch (Exception e) {
            e.getMessage();
            fileInputStreamH = null;
        }
        System.currentTimeMillis();
        if (fileInputStreamH == null) {
            return Boolean.FALSE;
        }
        B12.a(fileInputStreamH);
        return Boolean.TRUE;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        ((Boolean) obj).booleanValue();
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Object[] objArr) {
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
    }
}
