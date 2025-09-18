package p000;

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
public final class C8200Rb0 {

    /* renamed from: a */
    public final Context f10317a;

    /* renamed from: b */
    public final InterfaceC0970PP f10318b;

    /* renamed from: c */
    public final C7088we f10319c;

    public C8200Rb0(Context context, InterfaceC0970PP interfaceC0970PP, C7088we c7088we) {
        this.f10317a = context;
        this.f10318b = interfaceC0970PP;
        this.f10319c = c7088we;
    }

    /* renamed from: a */
    public final void m7045a(C1236Te c1236Te, int i, boolean z) {
        Context context = this.f10317a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(c1236Te.f11450a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        EnumC11261uD0 enumC11261uD0 = c1236Te.f11452c;
        adler32.update(byteBufferAllocate.putInt(AbstractC11770yD0.m26100a(enumC11261uD0)).array());
        byte[] bArr = c1236Te.f11451b;
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
                        AbstractC7858Km0.m4711a(c1236Te, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseM25901m = ((C11677xU0) this.f10318b).m25901m();
        String strValueOf = String.valueOf(AbstractC11770yD0.m26100a(enumC11261uD0));
        String str = c1236Te.f11450a;
        Cursor cursorRawQuery = sQLiteDatabaseM25901m.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            C7088we c7088we = this.f10319c;
            Long l = lValueOf;
            builder.setMinimumLatency(c7088we.m25658a(enumC11261uD0, jLongValue, i));
            Set set = ((C7151xe) c7088we.f45009b.get(enumC11261uD0)).f45724c;
            if (set.contains(AV0.f212a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(AV0.f214c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(AV0.f213b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", AbstractC11770yD0.m26100a(enumC11261uD0));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {c1236Te, Integer.valueOf(value), Long.valueOf(c7088we.m25658a(enumC11261uD0, jLongValue, i)), l, Integer.valueOf(i)};
            if (Log.isLoggable(AbstractC7858Km0.m4712b("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}
