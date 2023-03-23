require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Привет ! Ты попал в чат с Ботом телеграм канала (ПОТОП) . Завай свой вопрос

    state: Hello
        intent!: /Как попасть в телеграм канал Потом ?
        a: Для начала тебе нужно выслать свое резюме 

    state: Bye
        intent!: /пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}