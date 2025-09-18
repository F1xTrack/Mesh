package p000;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Na */
/* loaded from: classes.dex */
public final class C0855Na implements InterfaceC0729La {

    /* renamed from: m */
    public static final long f7878m = TimeUnit.MILLISECONDS.toNanos(500);

    /* renamed from: n */
    public static final /* synthetic */ int f7879n = 0;

    /* renamed from: a */
    public AudioRecord f7880a;

    /* renamed from: b */
    public final C6834sc f7881b;

    /* renamed from: f */
    public final int f7885f;

    /* renamed from: g */
    public final int f7886g;

    /* renamed from: h */
    public C7978Mu0 f7887h;

    /* renamed from: i */
    public ExecutorC10151lY0 f7888i;

    /* renamed from: j */
    public long f7889j;

    /* renamed from: k */
    public C0792Ma f7890k;

    /* renamed from: c */
    public final AtomicBoolean f7882c = new AtomicBoolean(false);

    /* renamed from: d */
    public final AtomicBoolean f7883d = new AtomicBoolean(false);

    /* renamed from: e */
    public final AtomicReference f7884e = new AtomicReference(null);

    /* renamed from: l */
    public boolean f7891l = false;

    /* JADX WARN: Removed duplicated region for block: B:40:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0855Na(p000.C6834sc r11, android.content.Context r12) throws p000.C0667Ka, java.lang.IllegalArgumentException {
        /*
            r10 = this;
            r0 = 2
            r1 = 1
            r10.<init>()
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            r10.f7882c = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r3)
            r10.f7883d = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r4 = 0
            r2.<init>(r4)
            r10.f7884e = r2
            r10.f7891l = r3
            int r2 = r11.f42497b
            r5 = 12
            r6 = 16
            int r7 = r11.f42498c
            int r8 = r11.f42499d
            if (r2 <= 0) goto L3a
            if (r7 > 0) goto L2d
            goto L3a
        L2d:
            if (r7 != r1) goto L31
            r9 = r6
            goto L32
        L31:
            r9 = r5
        L32:
            int r2 = android.media.AudioRecord.getMinBufferSize(r2, r9, r8)
            if (r2 <= 0) goto L3a
            r2 = r1
            goto L3b
        L3a:
            r2 = r3
        L3b:
            int r9 = r11.f42497b
            if (r2 == 0) goto L6f
            r10.f7881b = r11
            int r2 = r11.m24749a()
            r10.f7886g = r2
            if (r7 != r1) goto L4a
            r5 = r6
        L4a:
            int r2 = android.media.AudioRecord.getMinBufferSize(r9, r5, r8)
            if (r2 <= 0) goto L51
            r3 = r1
        L51:
            p000.AbstractC9104dM1.m17550i(r3, r4)
            int r2 = r2 * r0
            r10.f7885f = r2
            android.media.AudioRecord r11 = m5779b(r2, r11, r12)
            r10.f7880a = r11
            int r12 = r11.getState()
            if (r12 != r1) goto L64
            return
        L64:
            r11.release()
            Ka r11 = new Ka
            java.lang.String r12 = "Unable to initialize AudioRecord"
            r11.<init>(r12)
            throw r11
        L6f:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r3] = r12
            r5[r1] = r2
            r5[r0] = r4
            java.lang.String r12 = "The combination of sample rate %d, channel count %d and audio format %d is not supported."
            java.lang.String r12 = java.lang.String.format(r12, r5)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0855Na.<init>(sc, android.content.Context):void");
    }

    /* renamed from: b */
    public static AudioRecord m5779b(int i, C6834sc c6834sc, Context context) throws IllegalArgumentException {
        int i2 = Build.VERSION.SDK_INT;
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(c6834sc.f42497b).setChannelMask(c6834sc.f42498c == 1 ? 16 : 12).setEncoding(c6834sc.f42499d).build();
        AudioRecord.Builder builder = new AudioRecord.Builder();
        if (i2 >= 31 && context != null) {
            AbstractC1327V5.m8294c(builder, context);
        }
        builder.setAudioSource(c6834sc.f42496a);
        builder.setAudioFormat(audioFormatBuild);
        builder.setBufferSizeInBytes(i);
        return builder.build();
    }

    /* renamed from: a */
    public final void m5780a() {
        AbstractC9104dM1.m17550i(!this.f7882c.get(), "AudioStream has been released.");
    }

    /* renamed from: c */
    public final void m5781c(boolean z) {
        ExecutorC10151lY0 executorC10151lY0 = this.f7888i;
        C7978Mu0 c7978Mu0 = this.f7887h;
        if (executorC10151lY0 == null || c7978Mu0 == null || Objects.equals(this.f7884e.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            return;
        }
        executorC10151lY0.execute(new RunnableC7273za(c7978Mu0, z, 2));
    }

    /* renamed from: d */
    public final void m5782d() throws IllegalStateException, C0667Ka {
        m5780a();
        AtomicBoolean atomicBoolean = this.f7883d;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        if (AbstractC6941uJ.f43644a.m17864z0(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
            AudioRecord audioRecord = this.f7880a;
            if (audioRecord.getState() != 1) {
                audioRecord.release();
                throw new C0667Ka("Unable to initialize AudioRecord");
            }
        }
        this.f7880a.startRecording();
        boolean z = false;
        if (this.f7880a.getRecordingState() != 3) {
            atomicBoolean.set(false);
            throw new C0667Ka("Unable to start AudioRecord with state: " + this.f7880a.getRecordingState());
        }
        this.f7889j = 0L;
        this.f7891l = false;
        this.f7884e.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration audioRecordingConfigurationM7892a = AbstractC1264U5.m7892a(this.f7880a);
            z = audioRecordingConfigurationM7892a != null && AbstractC1264U5.m7893b(audioRecordingConfigurationM7892a);
        }
        m5781c(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0082  */
    @Override // p000.InterfaceC0729La
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C7023vc read(java.nio.ByteBuffer r13) {
        /*
            r12 = this;
            r12.m5780a()
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.f7883d
            boolean r0 = r0.get()
            java.lang.String r1 = "AudioStream has not been started."
            p000.AbstractC9104dM1.m17550i(r0, r1)
            android.media.AudioRecord r0 = r12.f7880a
            int r1 = r12.f7885f
            int r0 = r0.read(r13, r1)
            r1 = 0
            if (r0 <= 0) goto L92
            r13.limit(r0)
            int r13 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            r4 = -1
            if (r13 < r3) goto L7d
            boolean r13 = r12.f7891l
            if (r13 != 0) goto L7d
            android.media.AudioTimestamp r13 = new android.media.AudioTimestamp
            r13.<init>()
            android.media.AudioRecord r3 = r12.f7880a
            int r3 = p000.AbstractC1138S5.m7177b(r3, r13)
            if (r3 != 0) goto L78
            sc r3 = r12.f7881b
            int r3 = r3.f42497b
            long r6 = r12.f7889j
            long r8 = (long) r3
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r9 = 0
            r10 = 1
            if (r8 <= 0) goto L45
            r8 = r10
            goto L46
        L45:
            r8 = r9
        L46:
            java.lang.String r11 = "sampleRate must be greater than 0."
            p000.AbstractC9104dM1.m17545d(r11, r8)
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 < 0) goto L50
            r9 = r10
        L50:
            java.lang.String r8 = "framePosition must be no less than 0."
            p000.AbstractC9104dM1.m17545d(r8, r9)
            long r8 = r13.framePosition
            long r6 = r6 - r8
            long r6 = p000.AbstractC9620hO1.m18814b(r3, r6)
            long r8 = r13.nanoTime
            long r8 = r8 + r6
            int r13 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r13 >= 0) goto L64
            goto L65
        L64:
            r1 = r8
        L65:
            long r6 = java.lang.System.nanoTime()
            long r6 = r1 - r6
            long r6 = java.lang.Math.abs(r6)
            long r8 = p000.C0855Na.f7878m
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L7e
            r12.f7891l = r10
            goto L7d
        L78:
            java.lang.String r13 = "AudioStreamImpl"
            p000.AbstractC7806Jm0.m4412f(r13)
        L7d:
            r1 = r4
        L7e:
            int r13 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r13 != 0) goto L86
            long r1 = java.lang.System.nanoTime()
        L86:
            long r3 = r12.f7889j
            long r5 = (long) r0
            int r13 = r12.f7886g
            long r5 = p000.AbstractC9620hO1.m18815c(r13, r5)
            long r5 = r5 + r3
            r12.f7889j = r5
        L92:
            vc r13 = new vc
            r13.<init>(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0855Na.read(java.nio.ByteBuffer):vc");
    }
}
