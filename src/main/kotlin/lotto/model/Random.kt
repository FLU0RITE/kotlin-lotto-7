package lotto.model

import camp.nextstep.edu.missionutils.Randoms

class Random {
    fun generate(): List<Int> {
        return Randoms.pickUniqueNumbersInRange(1, 45, 6)
    }
}