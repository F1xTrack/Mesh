package defpackage;

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
public final class C1033Na implements InterfaceC0878La {
    public static final long m = TimeUnit.MILLISECONDS.toNanos(500);
    public static final /* synthetic */ int n = 0;
    public AudioRecord a;
    public final C7062sc b;
    public final int f;
    public final int g;
    public C1016Mu0 h;
    public ExecutorC5715lY0 i;
    public long j;
    public C0955Ma k;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicReference e = new AtomicReference(null);
    public boolean l = false;

    /* JADX WARN: Removed duplicated region for block: B:40:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1033Na(defpackage.C7062sc r11, android.content.Context r12) throws defpackage.C0800Ka, java.lang.IllegalArgumentException {
        /*
            r10 = this;
            r0 = 2
            r1 = 1
            r10.<init>()
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            r10.c = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r3)
            r10.d = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r4 = 0
            r2.<init>(r4)
            r10.e = r2
            r10.l = r3
            int r2 = r11.b
            r5 = 12
            r6 = 16
            int r7 = r11.c
            int r8 = r11.d
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
            int r9 = r11.b
            if (r2 == 0) goto L6f
            r10.b = r11
            int r2 = r11.a()
            r10.g = r2
            if (r7 != r1) goto L4a
            r5 = r6
        L4a:
            int r2 = android.media.AudioRecord.getMinBufferSize(r9, r5, r8)
            if (r2 <= 0) goto L51
            r3 = r1
        L51:
            defpackage.AbstractC3377dM1.i(r3, r4)
            int r2 = r2 * r0
            r10.f = r2
            android.media.AudioRecord r11 = b(r2, r11, r12)
            r10.a = r11
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1033Na.<init>(sc, android.content.Context):void");
    }

    public static AudioRecord b(int i, C7062sc c7062sc, Context context) throws IllegalArgumentException {
        int i2 = Build.VERSION.SDK_INT;
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(c7062sc.b).setChannelMask(c7062sc.c == 1 ? 16 : 12).setEncoding(c7062sc.d).build();
        AudioRecord.Builder builder = new AudioRecord.Builder();
        if (i2 >= 31 && context != null) {
            V5.c(builder, context);
        }
        builder.setAudioSource(c7062sc.a);
        builder.setAudioFormat(audioFormatBuild);
        builder.setBufferSizeInBytes(i);
        return builder.build();
    }

    public final void a() {
        AbstractC3377dM1.i(!this.c.get(), "AudioStream has been released.");
    }

    public final void c(boolean z) {
        ExecutorC5715lY0 executorC5715lY0 = this.i;
        C1016Mu0 c1016Mu0 = this.h;
        if (executorC5715lY0 == null || c1016Mu0 == null || Objects.equals(this.e.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            return;
        }
        executorC5715lY0.execute(new RunnableC8389za(c1016Mu0, z, 2));
    }

    public final void d() throws IllegalStateException, C0800Ka {
        a();
        AtomicBoolean atomicBoolean = this.d;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        if (AbstractC7387uJ.a.z0(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
            AudioRecord audioRecord = this.a;
            if (audioRecord.getState() != 1) {
                audioRecord.release();
                throw new C0800Ka("Unable to initialize AudioRecord");
            }
        }
        this.a.startRecording();
        boolean z = false;
        if (this.a.getRecordingState() != 3) {
            atomicBoolean.set(false);
            throw new C0800Ka("Unable to start AudioRecord with state: " + this.a.getRecordingState());
        }
        this.j = 0L;
        this.l = false;
        this.e.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration audioRecordingConfigurationA = U5.a(this.a);
            z = audioRecordingConfigurationA != null && U5.b(audioRecordingConfigurationA);
        }
        c(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0082  */
    @Override // defpackage.InterfaceC0878La
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C7635vc read(java.nio.ByteBuffer r13) {
        /*
            r12 = this;
            r12.a()
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.d
            boolean r0 = r0.get()
            java.lang.String r1 = "AudioStream has not been started."
            defpackage.AbstractC3377dM1.i(r0, r1)
            android.media.AudioRecord r0 = r12.a
            int r1 = r12.f
            int r0 = r0.read(r13, r1)
            r1 = 0
            if (r0 <= 0) goto L92
            r13.limit(r0)
            int r13 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            r4 = -1
            if (r13 < r3) goto L7d
            boolean r13 = r12.l
            if (r13 != 0) goto L7d
            android.media.AudioTimestamp r13 = new android.media.AudioTimestamp
            r13.<init>()
            android.media.AudioRecord r3 = r12.a
            int r3 = defpackage.S5.b(r3, r13)
            if (r3 != 0) goto L78
            sc r3 = r12.b
            int r3 = r3.b
            long r6 = r12.j
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
            defpackage.AbstractC3377dM1.d(r11, r8)
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 < 0) goto L50
            r9 = r10
        L50:
            java.lang.String r8 = "framePosition must be no less than 0."
            defpackage.AbstractC3377dM1.d(r8, r9)
            long r8 = r13.framePosition
            long r6 = r6 - r8
            long r6 = defpackage.AbstractC4146hO1.b(r3, r6)
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
            long r8 = defpackage.C1033Na.m
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L7e
            r12.l = r10
            goto L7d
        L78:
            java.lang.String r13 = "AudioStreamImpl"
            defpackage.AbstractC0759Jm0.f(r13)
        L7d:
            r1 = r4
        L7e:
            int r13 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r13 != 0) goto L86
            long r1 = java.lang.System.nanoTime()
        L86:
            long r3 = r12.j
            long r5 = (long) r0
            int r13 = r12.g
            long r5 = defpackage.AbstractC4146hO1.c(r13, r5)
            long r5 = r5 + r3
            r12.j = r5
        L92:
            vc r13 = new vc
            r13.<init>(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1033Na.read(java.nio.ByteBuffer):vc");
    }
}
