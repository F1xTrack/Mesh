package defpackage;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.ui.TrackSelectionView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.a;
import com.google.android.material.timepicker.h;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import ru.mes.dnevnik.R;

/* renamed from: c2 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC2437c2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnClickListenerC2437c2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Message message;
        Message message2;
        Message message3;
        switch (this.a) {
            case 0:
                ((AbstractC6952s2) this.b).b();
                break;
            case 1:
                H3 h3 = (H3) this.b;
                Message messageObtain = (view != h3.i || (message3 = h3.k) == null) ? (view != h3.l || (message2 = h3.n) == null) ? (view != h3.o || (message = h3.q) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                h3.E.obtainMessage(1, h3.b).sendToTarget();
                break;
            case 2:
                C2394bo0 c2394bo0 = (C2394bo0) this.b;
                int i = c2394bo0.f;
                if (i != 2) {
                    if (i == 1) {
                        c2394bo0.t(2);
                        break;
                    }
                } else {
                    c2394bo0.t(1);
                    break;
                }
                break;
            case 3:
                a aVar = (a) this.b;
                InterfaceC7405uP interfaceC7405uPB = OZ1.b((ReactContext) aVar.getContext(), aVar.getId());
                if (interfaceC7405uPB != null) {
                    interfaceC7405uPB.g(new C7098so(OZ1.d(aVar.getContext()), aVar.getId(), 27));
                    break;
                }
                break;
            case 4:
                NB nb = (NB) this.b;
                ImageView imageView = nb.t;
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = nb.p;
                if (view != imageView) {
                    if (view != nb.v) {
                        if (view != nb.u) {
                            if (view != nb.w) {
                                if (view == searchView$SearchAutoComplete) {
                                    nb.n();
                                    break;
                                }
                            } else {
                                SearchableInfo searchableInfo = nb.e0;
                                if (searchableInfo != null) {
                                    try {
                                        if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                            if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                                nb.getContext().startActivity(nb.m(nb.I, searchableInfo));
                                                break;
                                            }
                                        } else {
                                            Intent intent = new Intent(nb.H);
                                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                                            intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                                            nb.getContext().startActivity(intent);
                                            break;
                                        }
                                    } catch (ActivityNotFoundException unused) {
                                        return;
                                    }
                                }
                            }
                        } else {
                            nb.s();
                            break;
                        }
                    } else {
                        nb.o();
                        break;
                    }
                } else {
                    nb.z(false);
                    searchView$SearchAutoComplete.requestFocus();
                    searchView$SearchAutoComplete.setImeVisibility(true);
                    View.OnClickListener onClickListener = nb.N;
                    if (onClickListener != null) {
                        onClickListener.onClick(nb);
                        break;
                    }
                }
                break;
            case 5:
                ((h) this.b).a(((Integer) view.getTag(R.id.selection_type)).intValue());
                break;
            case 6:
                C2165ab1 c2165ab1 = ((Toolbar) this.b).M;
                C0849Kq0 c0849Kq0 = c2165ab1 == null ? null : c2165ab1.b;
                if (c0849Kq0 != null) {
                    c0849Kq0.collapseActionView();
                    break;
                }
                break;
            default:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.b;
                CheckedTextView checkedTextView = trackSelectionView.c;
                HashMap map = trackSelectionView.g;
                boolean z = true;
                if (view == checkedTextView) {
                    trackSelectionView.l = true;
                    map.clear();
                } else if (view == trackSelectionView.d) {
                    trackSelectionView.l = false;
                    map.clear();
                } else {
                    trackSelectionView.l = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    C2168ac1 c2168ac1 = (C2168ac1) tag;
                    C3425dc1 c3425dc1 = c2168ac1.a;
                    C1272Qb1 c1272Qb1 = c3425dc1.b;
                    C1740Wb1 c1740Wb1 = (C1740Wb1) map.get(c1272Qb1);
                    int i2 = c2168ac1.b;
                    if (c1740Wb1 == null) {
                        if (!trackSelectionView.i && map.size() > 0) {
                            map.clear();
                        }
                        map.put(c1272Qb1, new C1740Wb1(c1272Qb1, P70.B(Integer.valueOf(i2))));
                    } else {
                        ArrayList arrayList = new ArrayList(c1740Wb1.b);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        boolean z2 = trackSelectionView.h && c3425dc1.c;
                        if (!z2 && (!trackSelectionView.i || trackSelectionView.f.size() <= 1)) {
                            z = false;
                        }
                        if (zIsChecked && z) {
                            arrayList.remove(Integer.valueOf(i2));
                            if (arrayList.isEmpty()) {
                                map.remove(c1272Qb1);
                            } else {
                                map.put(c1272Qb1, new C1740Wb1(c1272Qb1, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (z2) {
                                arrayList.add(Integer.valueOf(i2));
                                map.put(c1272Qb1, new C1740Wb1(c1272Qb1, arrayList));
                            } else {
                                map.put(c1272Qb1, new C1740Wb1(c1272Qb1, P70.B(Integer.valueOf(i2))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                break;
        }
    }
}
