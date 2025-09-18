package p000;

import android.content.Context;
import android.os.AsyncTask;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: Ps1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AsyncTaskC8131Ps1 extends AsyncTask {

    /* renamed from: a */
    public static volatile boolean f9322a = false;

    /* renamed from: a */
    public static void m6463a() {
        Context context;
        if (f9322a || (context = AbstractC9120dU1.f26123a) == null) {
            return;
        }
        f9322a = true;
        long j = AbstractC11984zu1.m26587a(context).getLong("lastCheckTime", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - j > 432000000) {
            AbstractC11984zu1.m26587a(context).edit().putLong("lastCheckTime", jCurrentTimeMillis).apply();
            new AsyncTaskC8131Ps1().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, AbstractC9120dU1.f26123a);
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) throws IOException {
        FileInputStream fileInputStreamM24461h;
        Context[] contextArr = (Context[]) objArr;
        System.currentTimeMillis();
        try {
            fileInputStreamM24461h = AbstractC6760ri.m24461h(contextArr[0]);
        } catch (Exception e) {
            e.getMessage();
            fileInputStreamM24461h = null;
        }
        System.currentTimeMillis();
        if (fileInputStreamM24461h == null) {
            return Boolean.FALSE;
        }
        B12.m464a(fileInputStreamM24461h);
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
