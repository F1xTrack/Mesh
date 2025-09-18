package defpackage;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: ka, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5529ka implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public C5529ka(C5720la c5720la, Handler handler) {
        this.c = c5720la;
        this.b = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        switch (this.a) {
            case 0:
                ((Handler) this.b).post(new RunnableC5338ja(this, i, 0));
                break;
            default:
                Activity currentActivity = ((S91) this.c).a.getCurrentActivity();
                C6818rK0 c6818rK0 = (C6818rK0) this.b;
                if (i == -2) {
                    c6818rK0.a.s.invoke(Boolean.FALSE);
                } else if (i == -1) {
                    c6818rK0.z = false;
                    c6818rK0.a.s.invoke(Boolean.FALSE);
                    if (currentActivity != null) {
                        currentActivity.runOnUiThread(new RunnableC5673lK0(c6818rK0, 2));
                    }
                    c6818rK0.v1.abandonAudioFocus(this);
                } else if (i == 1) {
                    c6818rK0.z = true;
                    c6818rK0.a.s.invoke(Boolean.TRUE);
                }
                if (c6818rK0.j != null && currentActivity != null) {
                    if (i != -3) {
                        if (i == 1 && !c6818rK0.w) {
                            final int i2 = 1;
                            currentActivity.runOnUiThread(new Runnable(this) { // from class: pK0
                                public final /* synthetic */ C5529ka b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i2) {
                                        case 0:
                                            C6818rK0 c6818rK02 = (C6818rK0) this.b.b;
                                            c6818rK02.j.a2(c6818rK02.C * 0.8f);
                                            break;
                                        default:
                                            C6818rK0 c6818rK03 = (C6818rK0) this.b.b;
                                            c6818rK03.j.a2(c6818rK03.C * 1.0f);
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    } else if (!c6818rK0.w) {
                        final int i3 = 0;
                        currentActivity.runOnUiThread(new Runnable(this) { // from class: pK0
                            public final /* synthetic */ C5529ka b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        C6818rK0 c6818rK02 = (C6818rK0) this.b.b;
                                        c6818rK02.j.a2(c6818rK02.C * 0.8f);
                                        break;
                                    default:
                                        C6818rK0 c6818rK03 = (C6818rK0) this.b.b;
                                        c6818rK03.j.a2(c6818rK03.C * 1.0f);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
                break;
        }
    }

    public C5529ka(S91 s91, C6818rK0 c6818rK0) {
        this.b = c6818rK0;
        this.c = s91;
    }
}
