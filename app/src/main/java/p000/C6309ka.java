package p000;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: ka */
/* loaded from: classes.dex */
public final class C6309ka implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f36544a = 1;

    /* renamed from: b */
    public final Object f36545b;

    /* renamed from: c */
    public final Object f36546c;

    public C6309ka(C6372la c6372la, Handler handler) {
        this.f36546c = c6372la;
        this.f36545b = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        switch (this.f36544a) {
            case 0:
                ((Handler) this.f36545b).post(new RunnableC6246ja(this, i, 0));
                break;
            default:
                Activity currentActivity = ((S91) this.f36546c).f10602a.getCurrentActivity();
                C10891rK0 c10891rK0 = (C10891rK0) this.f36545b;
                if (i == -2) {
                    c10891rK0.f41559a.f43830s.invoke(Boolean.FALSE);
                } else if (i == -1) {
                    c10891rK0.f41598z = false;
                    c10891rK0.f41559a.f43830s.invoke(Boolean.FALSE);
                    if (currentActivity != null) {
                        currentActivity.runOnUiThread(new RunnableC10123lK0(c10891rK0, 2));
                    }
                    c10891rK0.f41591v1.abandonAudioFocus(this);
                } else if (i == 1) {
                    c10891rK0.f41598z = true;
                    c10891rK0.f41559a.f43830s.invoke(Boolean.TRUE);
                }
                if (c10891rK0.f41573j != null && currentActivity != null) {
                    if (i != -3) {
                        if (i == 1 && !c10891rK0.f41592w) {
                            final int i2 = 1;
                            currentActivity.runOnUiThread(new Runnable(this) { // from class: pK0

                                /* renamed from: b */
                                public final /* synthetic */ C6309ka f40020b;

                                {
                                    this.f40020b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i2) {
                                        case 0:
                                            C10891rK0 c10891rK02 = (C10891rK0) this.f40020b.f36545b;
                                            c10891rK02.f41573j.m9029a2(c10891rK02.f41533C * 0.8f);
                                            break;
                                        default:
                                            C10891rK0 c10891rK03 = (C10891rK0) this.f40020b.f36545b;
                                            c10891rK03.f41573j.m9029a2(c10891rK03.f41533C * 1.0f);
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    } else if (!c10891rK0.f41592w) {
                        final int i3 = 0;
                        currentActivity.runOnUiThread(new Runnable(this) { // from class: pK0

                            /* renamed from: b */
                            public final /* synthetic */ C6309ka f40020b;

                            {
                                this.f40020b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        C10891rK0 c10891rK02 = (C10891rK0) this.f40020b.f36545b;
                                        c10891rK02.f41573j.m9029a2(c10891rK02.f41533C * 0.8f);
                                        break;
                                    default:
                                        C10891rK0 c10891rK03 = (C10891rK0) this.f40020b.f36545b;
                                        c10891rK03.f41573j.m9029a2(c10891rK03.f41533C * 1.0f);
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

    public C6309ka(S91 s91, C10891rK0 c10891rK0) {
        this.f36545b = c10891rK0;
        this.f36546c = s91;
    }
}
