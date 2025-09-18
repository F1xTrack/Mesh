package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* renamed from: Rb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1349Rb0 {
    public final Context a;
    public final PP b;
    public final C7831we c;

    public C1349Rb0(Context context, PP pp, C7831we c7831we) {
        this.a = context;
        this.b = pp;
        this.c = c7831we;
    }

    public final void a(C1513Te c1513Te, int i, boolean z) {
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(c1513Te.a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        EnumC7370uD0 enumC7370uD0 = c1513Te.c;
        adler32.update(byteBufferAllocate.putInt(AbstractC8131yD0.a(enumC7370uD0)).array());
        byte[] bArr = c1513Te.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        AbstractC0837Km0.a(c1513Te, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseM = ((C7992xU0) this.b).m();
        String strValueOf = String.valueOf(AbstractC8131yD0.a(enumC7370uD0));
        String str = c1513Te.a;
        Cursor cursorRawQuery = sQLiteDatabaseM.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            C7831we c7831we = this.c;
            Long l = lValueOf;
            builder.setMinimumLatency(c7831we.a(enumC7370uD0, jLongValue, i));
            Set set = ((C8021xe) c7831we.b.get(enumC7370uD0)).c;
            if (set.contains(AV0.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(AV0.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(AV0.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", AbstractC8131yD0.a(enumC7370uD0));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {c1513Te, Integer.valueOf(value), Long.valueOf(c7831we.a(enumC7370uD0, jLongValue, i)), l, Integer.valueOf(i)};
            if (Log.isLoggable(AbstractC0837Km0.b("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}
