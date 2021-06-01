package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoTicket {
    private List<Lotto> lottoList;

    public LottoTicket(int num) {
        lottoList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            lottoList.add(new Lotto());
        }
    }

    public List<Lotto> lottoList() {
        return lottoList;
    }

    public void compareWinList(WinningLotto winningLotto, LottoNumber bonusNumber) {
        List winList = winningLotto.value();
        for (int i = 0; i < lottoList.size(); i++) {
            lottoList.get(i).calculateWin(winList, bonusNumber);
        }
    }

    public List<LottoNumber> getLottoNumWithIdx(int idx) {
        return this.lottoList.get(idx).lottoNum();
    }

    public int getLottoSize() {
        return this.lottoList.size();
    }

}